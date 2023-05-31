package com.example.kontrolltoo2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pood {
    private String nimetus;
    private LocalTime avamisaeg;
    private LocalTime sulgemisaeg;
    private int kylastajateArv;

}