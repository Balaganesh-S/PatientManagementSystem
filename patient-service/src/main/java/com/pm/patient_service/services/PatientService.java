package com.pm.patient_service.services;

import com.pm.patient_service.DTOs.PatientRequestDto;
import com.pm.patient_service.DTOs.PatientResponseDto;

import java.util.List;
import java.util.UUID;

public interface PatientService {
    public List<PatientResponseDto> getPatients();
    public PatientResponseDto createPatient(PatientRequestDto patientRequestDto);
    public PatientResponseDto updatePatient(UUID id, PatientRequestDto patientRequestDto);
    public void deletePatient(UUID id);


}
