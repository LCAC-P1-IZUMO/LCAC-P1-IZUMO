package DataBase;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/**
 * Created by take_ on 2017/08/27.
 */

public class Person {

    /**
     * テーブルを作成する
     * @param db SQLiteのインスタンス
     */
    public static void sqlCreate(SQLiteDatabase db) {
        try {
            db.execSQL("DROP TABLE IF EXISTS Person");
            db.execSQL("CREATE TABLE Person ("
                    + " PersonId      INTEGER primary key autoincrement"
                    + ",PersonName    TEXT "
                    + ",Mail          TEXT"
                    + ");"
            );
        }
        catch (SQLiteException ex) {
            Log.e("SQLiteException", ex.getMessage());
        }
    }
}
