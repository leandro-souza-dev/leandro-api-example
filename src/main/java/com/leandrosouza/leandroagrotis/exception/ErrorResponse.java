package com.leandrosouza.leandroagrotis.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private List<ErrorModel> errorMessage;

}
@Data
@NoArgsConstructor
@AllArgsConstructor
class ErrorModel{
    private String fieldName;
    private Object rejectedValue;
    private String messageError;
}