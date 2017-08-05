package DataBase;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/**
 * Created by take_ on 2017/08/05.
 */

public class Scenario {

    /**
     * テーブルを作成する
     * @param db SQLiteのインスタンス
     */
    public static void sqlCreate(SQLiteDatabase db) {
        try {
            db.execSQL("DROP TABLE IF EXISTS Scenario");
            db.execSQL("CREATE TABLE Scenario ("
                    + " ScenarioId      INTEGER primary key autoincrement"
                    + ",GroupeId        INTEGER "
                    + ",ScenarioName    TEXT"
                    + ");"
            );
        }
        catch (SQLiteException ex) {
            Log.e("SQLiteException", ex.getMessage());
        }
    }

}
