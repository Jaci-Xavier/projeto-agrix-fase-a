package com.betrybe.agrix.controllers;

import com.betrybe.agrix.controllers.dto.FarmDto;
import com.betrybe.agrix.model.entities.Farm;
import com.betrybe.agrix.service.FarmService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FarmController.
 */

@Controller
@RequestMapping("/farms")
public class FarmController {
  private final FarmService farmService;

  /**
   * Constructor.
   */

  public FarmController(FarmService farmService) {
    this.farmService = farmService;
  }

  /**
   * Create a new farm.
   */

  @PostMapping
  public ResponseEntity<Farm> createFarm(@RequestBody FarmDto farmDto) {
    return new ResponseEntity<>(farmService.createFarm(
      farmDto.convertToFarm()
    ), HttpStatus.CREATED);
  }

}
