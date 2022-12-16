SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD   
FROM DOCTOR
WHERE MCDP_CD = 'CS' OR MCDP_CD = 'GS'   # MCDP_CD IN ('CS','GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC;

# DATE_FORMAT(날짜, '포맷')
# %Y => 4글자 년도   %y => 2글자 년도    %m => 2글자 월      %d => 2글자 일   %c => 1글자 월
# %M => 월 영문      %H => 24시간 시간   %l => 12시간 시간   %i => 분         %S => 초
