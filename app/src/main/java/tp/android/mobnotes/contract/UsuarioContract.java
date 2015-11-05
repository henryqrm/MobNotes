package tp.android.mobnotes.contract;

/**
 * Created by diogo marcos on 01/11/2015.
 */
public final class UsuarioContract {
    //Construtor
    public UsuarioContract(){}

    private static final String DB_NAME = "bd_mobnotes_android.sqlite";
    private static final String TABLE_USUARIO = "usuario";
    private static final String ID = "id";
    private static final String NOME = "nome";
    private static final String EMAIL = "email";
    private static final String SENHA = "senha";
    private static final String DATANASCIMENTO = "dataNascimento";

    /** Getters **/
    public static String getDB_NAME() {
        return DB_NAME;
    }

    public static String getTABLE_USUARIO() {
        return TABLE_USUARIO;
    }

    public static String getID() {
        return ID;
    }

    public static String getNOME() {
        return NOME;
    }

    public static String getEMAIL() {
        return EMAIL;
    }

    public static String getSENHA() {
        return SENHA;
    }

    public static String getDATANASCIMENTO() {
        return DATANASCIMENTO;
    }

    /** Método criar tabela **/
    public static String createTable(){
        String query =  "CREATE TABLE " + getTABLE_USUARIO();

        query += " (";
        query += getID() + " INTEGER PRIMARY KEY AUTOINCREMENT, ";
        query += getNOME() + " TEXT, ";
        query += getEMAIL() + " TEXT, ";
        query += getSENHA() + " TEXT, ";
        query += getDATANASCIMENTO() + " TEXT ";
        query += ")";

        return (query);
    }
}

