package com.example.areospikedemo.repositories;

import com.example.areospikedemo.objects.User;
import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AerospikeUserRepository extends AerospikeRepository<User, Object> {

}