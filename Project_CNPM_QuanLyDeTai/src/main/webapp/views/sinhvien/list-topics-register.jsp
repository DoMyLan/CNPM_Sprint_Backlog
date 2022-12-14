<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url value="/student" var="link"></c:url>
    
<div class="panel panel-default">
    <div style="color: rgb(7, 132, 163);" class="panel-heading">
        <h4 style="font-family: verdana;color:rgb(87,87,87);">Danh sách đề tài</h4>
    </div>
    <div class="panel-body">
        <table class="table demo footable-loaded footable" data-page-size="5">
            <thead>
                <tr>
                    <th data="true">STT</th>
                    <th>Tên đề tài</th>
                    <th>Đăng kí</th>
                </tr>
            </thead>
            <tbody>
				<c:forEach items="${topics }" var="topic" varStatus="STT">
                     <tr>
                        <td>${STT.index+1 }</td>
                        <td>
                            <a href="${link }/chitietdetai?id=${topic.topicId }" style="color: rgb(68,68,68)!important;">${topic.topicName }</a>
                        </td>
                        <td>
                        	<c:if test="${topic.quantityRegister==0 && equal!=1}">
	                        	<div >
		                            <a  data-toggle="modal" href="${link }/register?email=${email }&topicId=${topic.topicId }&leader=1" >Đăng kí     </a>
	                            </div>
                            </c:if>
                            <c:if test="${(topic.quantityRegister==1 || topic.quantityRegister==2) && equal!=1 }">
	                        	<div >
		                            <a data-toggle="modal" href="${link }/register?email=${email }&topicId=${topic.topicId }&leader=0" >     Xin vào nhóm</a>
	                            </div>
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
            <tfoot>
                <tr>
                    <td colspan="5"></td>
                </tr>
            </tfoot>
        </table>
    </div>
</div>