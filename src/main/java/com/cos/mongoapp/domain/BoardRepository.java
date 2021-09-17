package com.cos.mongoapp.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
// <Board, ?>  ?에 ID 타입을 넣는다
public interface BoardRepository extends MongoRepository<Board, String> {

}
