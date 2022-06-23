package com.example.petclinic2.services.map;

import java.util.*;

public abstract class AbstractMapService<T,ID extends Long> {
    protected Map<Long,T> map = new HashMap<>();
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    T save(ID id, T object){
        map.put(id,object);
        return object;
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf(entry-> entry.getValue().equals(object));
    }
   private Long getNextId(){
       return Collections.max(map.keySet()) + 1;
    }
}

