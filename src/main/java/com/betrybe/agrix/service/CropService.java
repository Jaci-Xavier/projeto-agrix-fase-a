package com.betrybe.agrix.service;

import com.betrybe.agrix.model.entities.Crop;
import com.betrybe.agrix.model.repositories.CropsRepositories;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * CropService.
 */

@Service
public class CropService {
  private final CropsRepositories cropRepository;

  /**
   * Constructor.
   */

  public CropService(CropsRepositories cropRepository) {
    this.cropRepository = cropRepository;
  }

  /**
   * Get all crops.
   */

  public List<Crop> getAllCrops() {
    return cropRepository.findAll();
  }

}
