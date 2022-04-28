package com.ag04.utils;
/**
*  @author aidaom17
 *  */
public interface DummyService {
    
    DummyDTO get(Long id);

    DummyDTO save(DummyDTO testDto);
}
