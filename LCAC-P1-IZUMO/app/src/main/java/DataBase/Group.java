package DataBase;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/**
 * Created by user on 2017/08/27.
 */

public class Group {

    /**
     * テーブルを作成する
     * @param db SQLiteのインスタンス
     */
    public static void sqlCreate(SQLiteDatabase db) {
        try {
            db.execSQL("DROP TABLE IF EXISTS Group");
            db.execSQL("CREATE TABLE Group ("
                    + " GroupId         INTEGER primary key"
                    + ",GroupName       TEXT"
                    + ",ReaderId        INTEGER"
                    + ",MemberId        INTEGER primary key"
                    + ");"
            );
        }
        catch (SQLiteException ex) {
            Log.e("SQLiteException", ex.getMessage());
        }
    }

}
