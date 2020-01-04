package com.tvanalizer.repository;

import com.tvanalizer.domain.TvLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface TvLogRepository extends JpaRepository<TvLog, Long> {

    @Query(value = "LOAD DATA INFILE ?1 INTO TABLE tv_log COLUMNS TERMINATED BY ';'", nativeQuery = true)
    TvLog loadDataFromFileToDb(String path);

    @Query(value = "SELECT name,\n" +
            "       ref,\n" +
            "       COUNT(ref) AS view_count,\n" +
            "       cusref,\n" +
            "       SEC_TO_TIME(SUM(duration)/1000) AS total_duration_per_day,\n" +
            "       date_part\n" +
            "FROM tv_log\n" +
            "WHERE duration > 0\n" +
            "GROUP BY ref, cusref, date_part\n" +
            "ORDER BY cusref\n" +
            "INTO OUTFILE ?1 COLUMNS TERMINATED BY ';'", nativeQuery = true)
    TvLog loadSortedDataFromDbToFile(String path);
}
