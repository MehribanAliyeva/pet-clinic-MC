package com.example.petclinic2.services.map;

import com.example.petclinic2.model.Speciality;
import com.example.petclinic2.services.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialitiesServiceMap extends AbstractMapService<Speciality,Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
      super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);

    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
