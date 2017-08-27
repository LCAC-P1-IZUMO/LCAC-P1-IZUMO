package DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

/**
 * データベースクラス
 */
public class TestDB extends SQLiteOpenHelper {
    /**
     * データベースフェイル名
     */
    public static final String DB_NAME = "TestDB.db";
    /**
     * データベースバージョン
     */
    public static final int DB_VERSION = 6;

    /**
     * コンストラクタ
     * @param context
     */
    public TestDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    /**
     * データベースが存在しない場合、データベースを作成する
     * @param db
     */
    public void onCreate(SQLiteDatabase db) {
        //**** テーブルの作成 ****//
        Command.sqlCreate(db);
        Scenario.sqlCreate(db);
    }

    /**
     * データベースアップグレード
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // テーブル追加・変更時に記述する
        Command.sqlCreate(db);
        Scenario.sqlCreate(db);
    }

}
