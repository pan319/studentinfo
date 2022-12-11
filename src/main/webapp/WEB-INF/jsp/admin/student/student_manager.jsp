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
</head>
<body>
<div class="layuimini-container">
    <div class="layuimini-main">

        <fieldset class="table-search-fieldset">
            <legend>搜索信息</legend>
            <div style="margin: 10px 10px 10px 10px">
                <form class="layui-form layui-form-pane" action="">
                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">用户姓名</label>
                            <div class="layui-input-inline">
                                <input type="text" name="username" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">用户性别</label>
                            <div class="layui-input-inline">
                                <input type="text" name="sex" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">用户城市</label>
                            <div class="layui-input-inline">
                                <input type="text" name="city" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">用户职业</label>
                            <div class="layui-input-inline">
                                <input type="text" name="classify" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <button type="submit" class="layui-btn layui-btn-primary"  lay-submit lay-filter="data-search-btn"><i class="layui-icon"></i> 搜 索</button>
                        </div>
                    </div>
                </form>
            </div>
        </fieldset>

        <script type="text/html" id="toolbarDemo">
            <div class="layui-btn-container">
                <button class="layui-btn layui-btn-normal layui-btn-sm data-add-btn" lay-event="add"> 添加 </button>
            </div>
        </script>

        <table class="layui-hide" id="currentTableId" lay-filter="currentTableFilter"></table>

        <script type="text/html" id="currentTableBar">
            <a class="layui-btn layui-btn-normal layui-btn-xs data-count-edit" lay-event="edit">编辑</a>
            <a class="layui-btn layui-btn-xs layui-btn-danger data-count-delete" lay-event="delete">删除</a>
        </script>

    </div>
</div>
<%-- 添加和修改窗口 --%>
<div style="display: none;padding: 5px" id="addOrUpdateWindow">
    <form class="layui-form" style="width:90%;" id="dataFrm" lay-filter="dataFrm">
        <div class="layui-form-item">
            <label class="layui-form-label">学号</label>
            <div class="layui-input-block">
                <%-- 隐藏域 --%>
                <input type="hidden" name="id">
                <input type="text" name="name" lay-verify="required" autocomplete="off"
                       placeholder="请输入学生学号" class="layui-input"/>
            </div>
        </div>

        <%--姓名--%>
        <div class="layui-form-item">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-block">
                <input type="text" name="name" lay-verify="required" autocomplete="off" placeholder="请输入部门地址"
                       class="layui-input"/>
            </div>
        </div>

        <%--年龄--%>
        <div class="layui-form-item">
            <label class="layui-form-label">年龄</label>
            <div class="layui-input-block">
                <textarea class="layui-textarea" name="remark" id="content"></textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block">
                <input type="text" name="name" lay-verify="required" autocomplete="off" placeholder="请输入部门地址"
                       class="layui-input"/>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">身份证</label>
            <div class="layui-input-block">
                <input type="text" name="name" lay-verify="required" autocomplete="off" placeholder="请输入部门地址"
                       class="layui-input"/>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">学院</label>
            <div class="layui-input-block">
                <input type="text" name="name" lay-verify="required" autocomplete="off" placeholder="请选择学院"
                       class="layui-input"/>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">专业</label>
            <div class="layui-input-block">
                <input type="text" name="name" lay-verify="required" autocomplete="off" placeholder="请选择专业"
                       class="layui-input"/>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">班级</label>
            <div class="layui-input-block">
                <input type="text" name="name" lay-verify="required" autocomplete="off" placeholder="请选择班级"
                       class="layui-input"/>
            </div>
        </div>

        <div class="layui-form-item layui-row layui-col-xs12">
            <div class="layui-input-block" style="text-align: center;">
                <button type="button" class="layui-btn" lay-submit lay-filter="doSubmit"><span
                        class="layui-icon layui-icon-add-1"></span>提交
                </button>
                <button type="reset" class="layui-btn layui-btn-warm"><span
                        class="layui-icon layui-icon-refresh-1"></span>重置
                </button>
            </div>
        </div>
    </form>
</div>
<script src="${pageContext.request.contextPath}/statics/layui/lib/layui-v2.6.3/layui.js" charset="utf-8"></script>
<script>
    layui.use(['form', 'table'], function () {
        var $ = layui.jquery,
            form = layui.form,
            table = layui.table;

        var tableIns = table.render({
            elem: '#currentTableId',
            url:  '${pageContext.request.contextPath}/admin/student/list',
            toolbar: '#toolbarDemo',
            defaultToolbar: ['filter', 'exports', 'print', {
                title: '提示',
                layEvent: 'LAYTABLE_TIPS',
                icon: 'layui-icon-tips'
            }],
            cols: [[
                {type: "checkbox", width: 50},
                {field: 'id', width: 80, title: 'ID', sort: true},
                {field: 'sno', width: 100, title: '学号',align: "center"},
                {field: 'name', width: 80, title: '姓名',align: "center"},
                {field: 'sex', width: 80, title: '性别',align: "center"},
                {field: 'age', title: '年龄', width: 80,align: "center"},
                {field: 'cardId', width: 200, title: '身份证号',align: "center"},
                {title: '操作', minWidth: 150, toolbar: '#currentTableBar', align: "center"}
            ]],
            limits: [10, 15, 20, 25, 50, 100],
            limit: 15,
            page: true,
            skin: 'line'
        });

        // 监听搜索操作
        form.on('submit(data-search-btn)', function (data) {
            //执行搜索重载
            tableIns.reload({
                where: data.field,
                page: {
                    curr: 1
                }
            });

            return false;
        });

        /**
         * toolbar监听事件
         */

        /*//监听表格复选框选择
        table.on('checkbox(currentTableFilter)', function (obj) {
            console.log(obj)
        });*/
            table.on('toolbar(currentTableFilter)', function(obj){
                var checkStatus = table.checkStatus(obj.config.id);

                if (obj.event === 'add') {  // 监听添加操作
                    openAddWindow();
                }

            });
        table.on('tool(currentTableFilter)', function (obj) {
            var data = obj.data;
            if (obj.event === 'edit') {
                console.log('edit');
            } else if (obj.event === 'delete') {
                layer.confirm('真的删除行么', function (index) {

                });
            }
        });

            function openAddWindow() {
                var index = layer.open({
                    title: '添加用户',
                    type: 2,
                    shade: 0.2,
                    maxmin:true,
                    shadeClose: true,
                    area: ['100%', '100%'],
                    content: '${pageContext.request.contextPath}/admin/student/add.html',
            });
            $(window).on("resize", function () {
                layer.full(index);
            });
        }
        /**
         * 删除部门
         * @param data
         */
/*        function deleteById(data) {
            layer.confirm('真的删除行么', function (index) {
                $.ajax({
                    type: "post",
                    url: "/admin/student/deleteById",
                    // contentType: 'application/json;charset=utf-8',
                    dataType: "json",
                    //后台数据处理-下面有具体实现
                    data: {
                        "id": data.id,
                    },
                    success: function (result) {
                        console.log(result.success);
                        console.log(result);
                        if(result.success){
                            tableIns.reload();
                        }
                        //提示
                        layer.msg(result.message);
                    }
                });
                layer.close(index);
            });

        }*/

    });
</script>

</body>
</html>