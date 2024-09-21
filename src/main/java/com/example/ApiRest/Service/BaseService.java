package com.example.ApiRest.Service;
import java.util.List;

/*Recibe cualquier entidad y puede aplicar los metodos que se indican*/
public interface BaseService<E> {
        public List<E> findAll() throws Exception; //Lista de todas las entidades
        public E findById(Long id) throws Exception; //Trae una entidad en funcion de su Id
        public E save (E entity) throws Exception; //Guarda una entidad en funcion de su Id
        public E update(Long id, E entity) throws Exception; //Actualiza la entidad en funcion de su Id
        public boolean delete (Long id) throws Exception; //Elimina el registro segun su Id


}
