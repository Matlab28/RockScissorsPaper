package com.example.rsp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ToolsDto {
    ROCK("Rock"),
    SCISSORS("Scissors"),
    PAPER("Paper");

    public String values;
}
