package DataBase;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/**
 * Created by take_ on 2017/09/02.
 */

public class Member {

    /**
     * テーブルを作成する
     * @param db SQLiteのインスタンス
     */
    public static void sqlCreate(SQLiteDatabase db) {
        try {
            db.execSQL("DROP TABLE IF EXISTS Member");
            db.execSQL("CREATE TABLE Memer ("
                    + " GroupId         INTEGER primary key"
                    + ",PersonId        INTEGER"
                    + ");"
            );
        }
        catch (SQLiteException ex) {
            Log.e("SQLiteException", ex.getMessage());
        }
    }




}
