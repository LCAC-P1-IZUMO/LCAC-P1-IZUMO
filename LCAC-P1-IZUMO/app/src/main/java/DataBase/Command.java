package DataBase;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/**
 * Created by admin_m on 2017/08/05.
 */

public class Command {

    /**
     * テーブルを作成する
     * @param db SQLiteのインスタンス
     */
    public static void sqlCreate(SQLiteDatabase db) {
        try {
            db.execSQL("DROP TABLE IF EXISTS Command");
            db.execSQL("CREATE TABLE Command ("
                    + " ScenarioId      INTEGER primary key"
                    + ",CommandId       INTEGER primary key autoincrement"
                    + ",Commandtext     TEXT"
                    + ",StartTime       TEXT"
                    + ",EndTime         TEXT"
                    + ");"
            );
        }
        catch (SQLiteException ex) {
            Log.e("SQLiteException", ex.getMessage());
        }
    }

}
