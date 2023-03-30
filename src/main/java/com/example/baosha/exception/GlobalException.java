package com.example.baosha.exception;

import com.example.baosha.vo.RespBeanEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalException extends RuntimeException {
	private RespBeanEnum respBeanEnum;
}