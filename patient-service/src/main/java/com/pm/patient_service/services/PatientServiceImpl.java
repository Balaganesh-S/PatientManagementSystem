package com.pm.patient_service.services;

import com.pm.patient_service.DTOs.PatientRequestDto;
import com.pm.patient_service.DTOs.PatientResponseDto;
import com.pm.patient_service.mapper.PatientMapper;
import com.pm.patient_service.model.Patient;
import com.pm.patient_service.repositories.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository patientRepository;
    @Override
    public List<PatientResponseDto> getPatients() {
        List<Patient> patientList = patientRepository.findAll();

        List<PatientResponseDto> patientResponseDtoList = patientList.stream()
                .map(PatientMapper::toDto).toList();

        return  patientResponseDtoList;
    }

    @Override
    public PatientResponseDto createPatient(PatientRequestDto patientRequestDto) {
        Patient newPatient = patientRepository.save(PatientMapper.toModel(patientRequestDto));
        return PatientMapper.toDto(newPatient);
    }
}
