package org.example.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RechargeRequestDto {
    Long userId;

    Double balance;

}
