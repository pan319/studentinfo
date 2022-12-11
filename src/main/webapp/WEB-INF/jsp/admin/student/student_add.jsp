<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/lib/layui-v2.6.3/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui/css/public.css" media="all">
    <style>
        body {
            background-color: #ffffff;
        }
    </style>
</head>
<body>
<div class="layui-form layuimini-form">
    <div class="layui-form-item">
        <label class="layui-form-label required">用户名</label>
        <div class="layui-input-block">
            <input type="text" name="username" lay-verify="required" lay-reqtext="用户名不能为空" placeholder="请输入用户名" value="" class="layui-input">
            <tip>填写自己管理账号的名称。</tip>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label required">性别</label>
        <div class="layui-input-block">
            <input type="radio" name="sex" value="男" title="男" checked="">
            <input type="radio" name="sex" value="女" title="女">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">学院</label>
        <div class="layui-input-inline">
            <select name="quiz1" id="college" lay-filter="college">
                <option value="">请选择省</option>
            </select>
        </div>
        <div class="layui-input-inline">
            <select name="quiz2" id="major" lay-filter="major">
                <option value="">请选择专业</option>
                <option value="宁波" >宁波</option>
                <option value="温州">温州</option>
                <option value="温州">台州</option>
            </select>
        </div>
        <div class="layui-input-inline">
            <select name="quiz3" id="class" lay-filter="class">
                <option value="">请选择班级</option>

            </select>
        </div>
        <div class="layui-form-mid layui-word-aux"></div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">邮箱</label>
        <div class="layui-input-block">
            <input type="email" name="email" placeholder="请输入邮箱" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">职业</label>
        <div class="layui-input-block">
            <input type="text" name="work" placeholder="请输入职业" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">备注信息</label>
        <div class="layui-input-block">
            <textarea name="remark" class="layui-textarea" placeholder="请输入备注信息"></textarea>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn layui-btn-normal" lay-submit lay-filter="saveBtn">确认保存</button>
        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/statics/layui/lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form'], function () {
        var form = layui.form,
            layer = layui.layer,
            $ = layui.$;

        //加载学院下拉框数据
        $.post("${pageContext.request.contextPath}/colleges/list", function (datas) {
            if (datas != null) {
                for (var i = 0; i < datas.length; i++) {
                    $("#college").append("<option value='" + datas[i].collegeCode + "'>" + datas[i].collegeName + "</option>");
                }
                //重新渲染
                form.render('select');
            }
        });



        //监听提交
        form.on('submit(saveBtn)', function (data) {
            var index = layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            }, function () {

                // 关闭弹出层
                layer.close(index);

                var iframeIndex = parent.layer.getFrameIndex(window.name);
                parent.layer.close(iframeIndex);

            });

            return false;
        });

        form.on('select(college)', function(data){
            $("#major").empty();
            var majorHtml = '<option value="">请选择专业</option>';
            $("#major").html(majorHtml);

            var collegeCode = $("#college").val();
            console.log(collegeCode);
            //异步加载下拉框数据
            $.post("${pageContext.request.contextPath}/major/list", { collegeCode: collegeCode }, function (datas) {
                if (datas != null) {
                    for (var i = 0; i < datas.length; i++) {
                        $('#major').append("<option value='" + datas[i].majorCode + "'>" + datas[i].majorName + "</option>");
                    }
                    //重新渲染
                    form.render('select');
                }

            });
        });
        //监听市下拉框
        form.on('select(major)', function (dataObj) {
            //移除县区下拉框所有选项
            $("#class").empty();
            var html = '<option value="">请选择班级</option>';
            $("#class").html(html);
            var majorCode = $("#major").val();
            //异步加载下拉框数据
            $.post("${pageContext.request.contextPath}/class/list", { majorCode: majorCode }, function (datas) {
                if (datas != null) {
                    for (var i = 0; i < datas.length; i++) {
                        $('#class').append("<option value='" + datas[i].classCode + "'>" + datas[i].className + "</option>");
                    }
                    //重新渲染
                    form.render('select');
                }
            });

        });

    });
</script>
</body>
</html>