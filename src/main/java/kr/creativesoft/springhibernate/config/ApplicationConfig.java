/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kr.creativesoft.springhibernate.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author seungkim
 */

@Configuration
@ComponentScan(basePackages = { "kr.creativesoft.springhibernate.dao",  "kr.creativesoft.springhibernate.service"})
//@Import({ DBConfig.class })
public class ApplicationConfig {

}