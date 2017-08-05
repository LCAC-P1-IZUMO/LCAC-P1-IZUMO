package DataBase;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import android.util.Log;

/**
 * [Table01]テーブル
 */
public class Table01 {
    /**
     * テーブルを作成する
     * @param db SQLiteのインスタンス
     */
    public static void sqlCreate(SQLiteDatabase db) {
        try {
            db.execSQL("DROP TABLE IF EXISTS Table01");
            db.execSQL("CREATE TABLE Table01 ("
                    + " Suuchi      INTEGER primary key autoincrement"
                    + ",MojiretsuA  TEXT"
                    + ");"
            );
        }
        catch (SQLiteException ex) {
            Log.e("SQLiteException", ex.getMessage());
        }
    }

    /**
     * 引数で指定された値を条件に全項目を取得する
     * @param db SQLiteのインスタンス
     * @param vague 曖昧検索
     * @param suuchi [数値項目]
     * @param mojiretsuA [文字項目A]
     * @return 検索結果カーソル
     */
    public static SQLiteCursor sqlSelectAllColumns(
            SQLiteDatabase db,
            boolean vague,
            String suuchi,
            String mojiretsuA
    ) {
        try {
            String sql = "SELECT * FROM Table01 ";
            sql += "WHERE 1=1 ";

            if (!suuchi.equals("")) {
                sql += " AND CAST(Suuchi as TEXT) = ";
                sql += vague ? ("'%" + suuchi + "%'") : ("'" + suuchi + "'");
            }
            if (!mojiretsuA.equals("")) {
                sql += " AND MojiretsuA = ";
                sql += vague ? ("'%" + mojiretsuA + "%'") : ("'" + mojiretsuA + "'");
            }

            return (SQLiteCursor) db.rawQuery(sql, null);
        }
        catch (SQLiteException ex) {
            Log.e("SQLiteException", ex.getMessage());
            return null;
        }
    }

    /**
     * 引数で指定された値を条件に全項目を取得する
     * @param db SQLiteのインスタンス
     * @param update 更新許可
     * @param suuchi [数値項目]
     * @param mojiretsuA [文字項目A]
     * @return 登録・更新結果
     */
    public static boolean sqlRegist(
            SQLiteDatabase db,
            boolean update,
            String suuchi,
            String mojiretsuA
    ) {
        try {
            SQLiteCursor cur = sqlSelectAllColumns(db, false, suuchi, mojiretsuA);

            // 未登録の場合Insert
            if (0 == cur.getCount()) {
                ContentValues cv = new ContentValues();
                cv.put("MojiretsuA", mojiretsuA);
                db.insert("Table01", null, cv);
                return true;
            }

            // 登録済みかつ更新が承認された場合
            if (update) {
                return true;
            }

            return false;
        }
        catch (SQLiteException ex) {
            Log.e("SQLiteException", ex.getMessage());
            return false;
        }
    }
}