<%@ page language="java"  contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h2>嗨，你好</h2>


springMVC上传文件
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="springMVC上传文件" />
</form>

富文本图片上传文件
<form name="form2" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="富文本图片上传文件" />
</form>

<a href='http://img.pipikai.xin/a860dd41-4ec0-4314-b525-a25cdd73aa1a.jpg'>点击领取兔斯基</a>
</body>
</html>
