package com.betrybe.agrix.service;

import com.betrybe.agrix.model.entities.Farm;
import com.betrybe.agrix.model.repositories.FarmsRepositories;
import com.betrybe.agrix.service.exceptions.NotFoundExcepion;
import java.util.List;
import java.util.Optional;
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

  /**
   * Get a farm by id.
   */

  public Farm getFarmById(Long id) {
    Optional<Farm> farm = farmsRepository.findById(id);

    if (farm.isEmpty()) {
      throw new NotFoundExcepion("Fazenda não encontrada!");
    }

    return farm.get();
  }
}
