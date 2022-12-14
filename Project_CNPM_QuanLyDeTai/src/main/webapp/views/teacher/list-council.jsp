<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div style="color: rgb(7, 132, 163);" class="panel-heading">
		<h4 style="font-family: verdana; color: rgb(87, 87, 87);">Hội
			đồng</h4>
	</div>

	<table class="table">
		<thead>
			<tr>
				<th>Tên đề tài</th>
				<th>Điểm số</th>
				<th>Danh sách giảng viên</th>
				<th></th>
			</tr>
		</thead>
		<tbody class="table-body">
			<c:forEach var="counCil" items="${listCouncil}">
				<tr>
					<td>${iTopicDao.getById(counCil.topicId).topicName}</td>
					<td>${counCil.averageScore}</td>
					<td><c:forEach items="${iCouncilDetailsDao.getAllByCouncilId(counCil.id)}" var="item">
						${iTeachersDao.findById(item.teacherId).teacherName}<br>
					</c:forEach></td>
					<td><a>Chấm điểm</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
	</table>

	<a class="btn btn-primary" href="../topics">Trở về</a>
</div>


