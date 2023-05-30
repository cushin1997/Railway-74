USE `TestingSystem`;


/*Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ*/
SELECT A.Email, A.Username , A.FullName, D.DepartmentName
FROM `Account` A
INNER JOIN Department D ON A.DepartmentID = D.DepartmentID;

/*Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010*/
SELECT *FROM `Account`
WHERE CreateDate < '2020-12-20';

/*Question 3: Viết lệnh để lấy ra tất cả các developer*/
SELECT A.FullName, A.Email, P.PositionName
FROM `Account` A
INNER JOIN Position P ON A.PositionID = P.PositionID
WHERE P.PositionName = 'Dev';
select*from department;
/*Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên*/
SELECT D.DepartmentName, count(a.DepartmentID) AS SL FROM`account` A
INNER JOIN department D ON A.DepartmentID = D.DepartmentID
GROUP BY A.DepartmentID
HAVING COUNT(A.DepartmentID) >3;



/*Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất*/

SELECT Q.Content ,  E.QuestionID ,COUNT(E.QuestionID)   FROM ExamQuestion E 
JOIN Question Q ON  Q.QuestionID = E.QuestionID
GROUP BY Q.QuestionID
HAVING  COUNT(E.QuestionID) = 	(SELECT MAX(countQID) AS MaxconutQ FROM 
																(SELECT COUNT(E.QuestionID) as countQID 
															  FROM ExamQuestion E GROUP BY E.QuestionID) AS countTable);

/*q6Thông kê mỗi Category Question được sử dụng trong bao nhiêu Question*/
 SELECT C.CategoryID ,C.CategoryName,count(q.CategoryID) as num FROM CategoryQuestion C
 JOIN Question Q ON Q.CategoryID=C.CategoryID
 GROUP BY C.CategoryID;

/*Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam*/
SELECT  Q.QuestionID,Q.Content, count(EQ.QuestionID) FROM ExamQuestion EQ
RIGHT JOIN Question Q ON Q.QuestionID = EQ.QuestionID
GROUP BY  Q.QuestionID ;

/*Question 8: Lấy ra Question có nhiều câu trả lời nhất*/
SELECT q.Content , q.QuestionID , count(A.QuestionID) FROM Question q 
JOIN Answer a ON q.QuestionID = a.QuestionID
GROUP BY q.QuestionID
HAVING count(A.QuestionID) = ( SELECT max(countQuestionID)  AS maxAnswer FROM
							(SELECT count(A.QuestionID) AS  countQuestionID FROM Answer a GROUP BY A.QuestionID )AS counttable);
/*Question 9: Thống kê số lượng account trong mỗi group*/
SELECT G.GroupID, COUNT(GA.AccountID) AS 'SO LUONG'
FROM GroupAccount GA
JOIN `Group` G ON GA.GroupID = G.GroupID
GROUP BY G.GroupID
ORDER BY G.GroupID ASC;
 /*Question 10: Tìm chức vụ có ít người nhất*/
 SELECT  count(A.PositionID) SL  , P.PositionID, P.PositionName  FROM `Account` A
 INNER  JOIN Position P  ON A.PositionID = p.PositionID 
 GROUP BY A.PositionID 
 HAVING count(A.PositionID)= (SELECT MIN(minP) FROM(SELECT count(B.PositionID) AS minP FROM `Account` B
														GROUP BY B.PositionID) AS minPA);
 
/*Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM*/
SELECT d.DepartmentID,d.DepartmentName, p.PositionName, count(p.PositionName) FROM `account` a
INNER JOIN department d ON a.DepartmentID = d.DepartmentID
INNER JOIN position p ON a.PositionID = p.PositionID
GROUP BY d.DepartmentID, p.PositionID;

/*Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, ...*/
SELECT Q.QuestionID, Q.Content, A.FullName, TQ.TypeName AS Author, ANS.Content FROM question Q
INNER JOIN categoryquestion CQ ON Q.CategoryID = CQ.CategoryID
INNER JOIN typequestion TQ ON Q.TypeID = TQ.TypeID
INNER JOIN account A ON A.AccountID = Q.CreatorID
INNER JOIN Answer AS ANS ON Q.QuestionID = ANS.QuestionID
ORDER BY Q.QuestionID ASC;

/*Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm*/
SELECT TQ.TypeID, TQ.TypeName, COUNT(Q.TypeID) AS SL FROM question Q
INNER JOIN typequestion TQ ON Q.TypeID = TQ.TypeID
GROUP BY Q.TypeID;

/*Question 14:Lấy ra group không có account nào*/
SELECT * FROM `group` g
LEFT JOIN groupaccount ga ON g.GroupID = ga.GroupID
WHERE GA.AccountID IS NULL;

/*Question 15: Lấy ra group không có account nào*/
SELECT * FROM groupaccount ga
RIGHT JOIN `group` g ON ga.GroupID = g.GroupID
WHERE ga.AccountID IS NULL;
/*Question 16: Lấy ra question không có answer nào*/
SELECT *FROM Question
WHERE QuestionID NOT IN (SELECT QuestionID From Answer);

/*Question 17*/
SELECT A.FullName, A.AccountID , GA.GroupID FROM `Account` A
JOIN GroupAccount GA ON A.AccountID = GA.AccountID
WHERE GA.GroupID = 1
union
SELECT A.FullName ,A.AccountID , GA.GroupID FROM `Account` A
JOIN GroupAccount GA ON A.AccountID = GA.AccountID
WHERE GA.GroupID = 2;

/*Q18*/
SELECT g.GroupName, COUNT(ga.GroupID) AS SL,g.GroupID FROM GroupAccount ga
JOIN `Group` g ON ga.GroupID = g.GroupID
GROUP BY g.GroupID
HAVING COUNT(ga.GroupID) >= 5
UNION
SELECT g.GroupName, COUNT(ga.GroupID) AS SL,g.GroupID FROM GroupAccount ga
JOIN `Group` g ON ga.GroupID = g.GroupID
GROUP BY g.GroupID
HAVING COUNT(ga.GroupID) <= 7;



