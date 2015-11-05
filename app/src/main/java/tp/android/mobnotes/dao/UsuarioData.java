package tp.android.mobnotes.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import tp.android.mobnotes.contract.UsuarioContract;
import tp.android.mobnotes.model.Usuario;

/**
 * Created by diogo marcos on 01/11/2015.
 */
public class UsuarioData extends SQLiteOpenHelper{
    SQLiteDatabase db;

    //Construtor
    public UsuarioData(Context context){
        super(context, UsuarioContract.getDB_NAME(), null, 1);
        db = this.getReadableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UsuarioContract.createTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

    //Método para adicionar os valores no banco:
    public long createData(Usuario usuario) {
        SQLiteDatabase db = this.getWritableDatabase();

        //Criação de valores de conteúdo
        ContentValues values = new ContentValues();
        values.put(UsuarioContract.getNOME(), usuario.getNome());
        values.put(UsuarioContract.getEMAIL(), usuario.getEmail());
        values.put(UsuarioContract.getSENHA(), usuario.getSenha());
        values.put(UsuarioContract.getDATANASCIMENTO(), usuario.getDataNascimento());

        //Inserir uma linha na tabela

        long insert = db.insert(UsuarioContract.getTABLE_USUARIO(), null, values);

        return (insert);
    }

    //Método para atualizar os valores no banco:
    public int updateData(Usuario usuario) {
        SQLiteDatabase db = this.getWritableDatabase();

        //Criação de valores de conteúdo
        ContentValues values = new ContentValues();
        values.put(UsuarioContract.getNOME(), usuario.getNome());
        values.put(UsuarioContract.getEMAIL(), usuario.getEmail());
        values.put(UsuarioContract.getSENHA(), usuario.getSenha());
        values.put(UsuarioContract.getDATANASCIMENTO(), usuario.getDataNascimento());

        //atualização de linha na base da tabela de acordo com o ID
        return db.update(UsuarioContract.getTABLE_USUARIO(), values, UsuarioContract.getID() + " = ?",
                new String[] { String.valueOf(usuario.getId()) });
    }

    //Método para excluir o valor no banco:
    public void deleteData(long id) {

        //excluir linha na tabela de acordo com a ID
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsuarioContract.getTABLE_USUARIO(), UsuarioContract.getID() + " = ?",
                new String[] { String.valueOf(id) });
    }

    //teste:
    public Usuario getUsuario(long id) {
        SQLiteDatabase db = this.getReadableDatabase();

        // SELECT * FROM usuario WHERE id = ?;
        String selectQuery = "SELECT  * FROM " + UsuarioContract.getTABLE_USUARIO() + " WHERE "
                + UsuarioContract.getID() + " = " + id;
        //Log.d(TAG, selectQuery);

        Cursor c = db.rawQuery(selectQuery, null);

        if (c != null)
            c.moveToFirst();

        Usuario usuario = new Usuario();
        usuario.setId(c.getInt(c.getColumnIndex(UsuarioContract.getID())));
        usuario.setNome(c.getString(c.getColumnIndex(UsuarioContract.getNOME())));
        usuario.setEmail(c.getString(c.getColumnIndex(UsuarioContract.getEMAIL())));
        usuario.setSenha(c.getString(c.getColumnIndex(UsuarioContract.getSENHA())));
        usuario.setDataNascimento(c.getString(c.getColumnIndex(UsuarioContract.getDATANASCIMENTO())));

        return (usuario);
    }

    //teste:
    public List<Usuario> getAllUsuarios() {
        List<Usuario> usuariosArrayList = new ArrayList<Usuario>();

        String selectQuery = "SELECT  * FROM " + UsuarioContract.getTABLE_USUARIO();
        //Log.d(TAG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        //looping para adicionar os dados da arrayList
        if (c.moveToFirst()) {
            do {

                Usuario usuario = new Usuario();
                usuario.setId(c.getInt(c.getColumnIndex(UsuarioContract.getID())));
                usuario.setNome(c.getString(c.getColumnIndex(UsuarioContract.getNOME())));
                usuario.setEmail(c.getString(c.getColumnIndex(UsuarioContract.getEMAIL())));
                usuario.setSenha(c.getString(c.getColumnIndex(UsuarioContract.getSENHA())));
                usuario.setDataNascimento(c.getString(c.getColumnIndex(UsuarioContract.getDATANASCIMENTO())));

                // adiciona o arrayList
                usuariosArrayList.add(usuario);
            } while (c.moveToNext());
        }

        return (usuariosArrayList);
    }
}
