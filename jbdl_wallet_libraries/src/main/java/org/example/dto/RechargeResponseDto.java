package org.example.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RechargeResponseDto {
    Long userId;

    Double Balance;

    String gmail;
}
