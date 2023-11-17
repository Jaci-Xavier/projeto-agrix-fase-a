package com.betrybe.agrix.service;

import com.betrybe.agrix.model.entities.Farm;
import com.betrybe.agrix.model.repositories.FarmsRepositories;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * FarmService.
 */

@Service
public class FarmService {
  private final FarmsRepositories farmsRepository;

  /**
   * Constructor.
   */

  public FarmService(FarmsRepositories farmsRepository) {
    this.farmsRepository = farmsRepository;
  }

  /**
   * Create a new farm.
   */

  public Farm createFarm(Farm farm) {
    return farmsRepository.save(farm);
  }

  /**
   * Get all farms.
   */

  public List<Farm> getAllFarms() {
    return farmsRepository.findAll();
  }
}
