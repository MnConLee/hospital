package com.lmk.yygh.hospital.service;

import com.lmk.yygh.model.hosp.Schedule;
import com.lmk.yygh.vo.hosp.ScheduleQueryVo;
import org.springframework.data.domain.Page;

import java.util.Map;

/**
 * @author 李明康
 * @create 2022/8/22 10:44
 */
public interface ScheduleService {

    void save(Map<String, Object> paramMap);

    Page<Schedule> findPageSchedule(int page, int limit, ScheduleQueryVo scheduleQueryVo);

    void remove(String hoscode, String hosScheduleId);

    Map<String, Object> getScheduleRule(Long page, Long limit, String hoscode, String depcode);
}
