/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kr.kimnamsun.springhibernate.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "kr.kimnamsun.springhibernate.dao",  "kr.kimnamsun.springhibernate.service"})
//@Import({ DBConfig.class })
public class ApplicationConfig {

}