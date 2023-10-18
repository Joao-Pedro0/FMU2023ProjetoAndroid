package com.example.exemplo;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface FuncionarioDAO {

    @Query("SELECT * FROM Funcionario")
    List<Funcionario> getFuncionarios();

    @Query("SELECT * FROM Funcionario where re= :reFuncionario")
    Funcionario BuscarPorRe(int reFuncionario);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Funcionario funcionario);

    @Delete
    void delete(Funcionario funcionario);

    @Update
    void update(Funcionario funcionario);

}
