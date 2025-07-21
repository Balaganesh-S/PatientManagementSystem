package com.pm.patient_service.services;

import com.pm.patient_service.DTOs.PatientRequestDto;
import com.pm.patient_service.DTOs.PatientResponseDto;

import java.util.List;

public interface PatientService {
    public List<PatientResponseDto> getPatients();
    public PatientResponseDto createPatient(PatientRequestDto patientRequestDto);

}
