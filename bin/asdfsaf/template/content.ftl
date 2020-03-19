
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title><#if new.seotitle??>${new.seotitle}</#if>
</title>
<meta name="keywords" content="<#if new.seokeywords??>${new.seokeywords}</#if>" />
<meta name="description" content="<#if new.seodescription??>${new.seodescription}</#if>" />
<link rel="stylesheet" type="text/css" href="/templates/main/css/style.css" />
<script type="text/javascript" charset="utf-8" src="/scripts/jquery/jquery-1.11.2.min.js"></script>
<script type="text/javascript" charset="utf-8" src="/templates/main/js/common.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/fxw.js"></script>
</head>
<body id="food">

<div class="header">
<div class="head-top">
<div class="section">
<div class="left-box">
<div class="search">

</div>
</div>
<#noparse>
<script type="text/javascript">

                $.ajax({
                    type: "POST",
                    url: "/tools/submit_ajax.ashx?action=user_check_login",
                    dataType: "json",
                    timeout: 20000,
                    success: function (data, textStatus) {
                        if (data.status == 1) {
                            $("#menu").prepend('<a href="/user/center/exit.html">退出</a><strong>|</strong>');
                            $("#menu").prepend('<a href="/user/center/index.html">会员中心</a>');
                        } else {
                            $("#menu").prepend('<a href="/register.html">注册</a><strong>|</strong>');
                            $("#menu").prepend('<a href="/login.html">登录</a>');
                        }
                    }
                });
            </script>
</#noparse>
<div id="menu" class="right-box">
</div>
</div>
</div>
<div class="head-nav">
<div class="section">
<div class="logo">
<a href="/index.html"><img src="/templates/main/images/logo.png" /></a>
</div>
<div class="nav-box">
<ul>
<li class="index"><a href="/index.html">首页</a></li>
<li class="news"><a href="/news.html">资讯</a></li>
<li class="tech"><a href="/tech.html">科技</a></li>
<li class="yule"><a href="/yule.html">娱乐</a></li>
<li class="game"><a href="/game.html">游戏</a></li>
<li class="sports"><a href="/sports.html">体育</a></li>
<li class="finance"><a href="/finance.html">财经</a></li>
 <li class="military"><a href="/military.html">军事</a></li>
<li class="world"><a href="/world.html">国际</a></li>
<li class="fashion"><a href="/fashion.html">时尚</a></li>
<li class="travel"><a href="/travel.html">旅游</a></li>
<li class="discovery"><a href="/discovery.html">探索</a></li>
<li class="baby"><a href="/baby.html">育儿</a></li>
<li class="regimen"><a href="/regimen.html">养生</a></li>
<li class="essay"><a href="/essay.html">美文</a></li>
<li class="history"><a href="/history.html">历史</a></li>
<li class="food"><a href="/food.html">美食</a></li>
<li class="fxzx"><a href="/fxzx.html">丰胸资讯</a></li>
<li class="fxzx"><a href="/fxzx.html">隆胸资讯</a></li>
<li class="fxzx"><a href="/fxzx.html">胸部资讯</a></li>
<li class="fxzx"><a href="/fxzx.html">乳房资讯</a></li>
<li class="fxzx"><a href="/fxzx.html">丰乳资讯</a></li>
</ul>
</div>

</a>
</div>
</div>
</div>
</div>


<div class="section">
<div class="location">
<span>当前位置：</span>
<a href="/index.html">首页</a> &gt;
<a href="/${new.channelname}.html">${new.channeltitle}</a>
&nbsp;&gt;&nbsp;<a href="/${new.channelname}/list-${new.categoryId}.html">${new.categoryTitle}</a>
</div>
</div>

<div class="section">

<div class="right-260">
<div class="bg-wrap nobg">
<div class="sidebar-box">
<h4>资讯类别</h4>
<ul class="navbar">
<li>
<h5><a href="/${new.channelname}/list-${new.categoryId}.html">${new.categoryTitle}</a></h5>
<p>
</p>
</li>
</ul>
</div>
<div class="sidebar-box">
<h4>图片新闻</h4>
<ul class="side-img-list">
</ul>
</div>
<div class="sidebar-box">
<h4>阅读排行</h4>
<ul class="txt-list">






<#list ydphlist as newone >
<#if newone_index <= 9>
<#if newone.imgurl!=''>

<li>
<label>${newone_index+1}</label>
<a href="/${newone.channelname}/show${newone.addtimestring}-${newone.id}.html">${newone.title}</a>
</li>

</#if>
</#if>
</#list>













</ul>
</div>
<div class="sidebar-box">
<h4>热门标签</h4>
<div class="tags-box clearfix">
<a href="/search.html?tags=%e4%b8%b0%e8%83%b8">丰胸<i>(1101)</i></a>

</div>
</div>
</div>
</div>


<div class="left-auto">
<div class="bg-wrap">
<div class="meta">
<h2>${new.title}</h2>
<div class="info">
<span><i class="iconfont icon-date"></i>

    <#if new.addtime??>
${new.addtime}
     </#if>
</span>

<span>来源：${new.source}</span>
<span>来源：${new.author}</span>



</div>
<div class="note">
<p></p>
</div>
</div>
<div class="entry">
<p style="font-size:15px;"><#if new.content??>${new.content}</#if></p>
<br /></article><footer></footer>
</div>

<div class="next-box clearfix">
<p class="prev">上一篇：<a href="/history/show20200314-507670.html">如若戊戌变法成功，康有为人种改造计划实现！中国将是人间炼狱</a></p>
<p class="next">下一篇：<a href="/history/show20200314-507672.html">#唤醒好春光# #我要上头条#
【当年乾隆皇帝读书静心之园，集中华园林之精华，宛若一幅画!】建于明朝，
乾隆时期精心打</a></p>
</div>


<div class="rel-box">
<h2 class="slide-tit">
<span>相关资讯</span>
</h2>
<ul class="rel-list">











<#list ydphlist as newone >
<#if newone_index <= 3>
<#if newone.imgurl!=''>

<div class="img-box">
<a title="${newone.title}" href="/${newone.channelname}/show${newone.addtimestring}-${newone.id}.html">
<img data-cfsrc="${newone.imgurl}" src="${newone.imgurl}">
</a>
</div>
<div class="info">
<h3><a title="${newone.title}" href="/${newone.channelname}/show${newone.addtimestring}-${newone.id}.html">${newone.title}</a></h3>
<p>${newone.title}…</p>
<span>${newone.addtimestring}</span>
</div>
</#if>
</#if>
</#list>



</ul>
</div>


<div class="comment-box">
<h2 class="slide-tit">
<strong>共有<script type="text/javascript" src="/tools/submit_ajax.ashx?action=view_comment_count&channel_id=${new.channelId}&id=${new.id}"></script>条评论</strong>
<span>网友评论</span>
</h2>

<link rel="stylesheet" type="text/css" href="/css/validate.css" />
<link rel="stylesheet" type="text/css" href="/css/pagination.css" />
<link rel="stylesheet" type="text/css" href="/scripts/artdialog/ui-dialog.css" />
<script type="text/javascript" charset="utf-8" src="/scripts/jquery/jquery.form.min.js"></script>
<script type="text/javascript" charset="utf-8" src="/scripts/artdialog/dialog-plus-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/scripts/jquery/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" charset="utf-8" src="/scripts/jquery/jquery.pagination.js"></script>
<script type="text/javascript">
                    $(function(){
                        //初始化评论列表
                        pageInitComment();
                        //初始化发表评论表单
                        AjaxInitForm('#commentForm', '#btnSubmit', 1, '', pageInitComment);
                    });
                    //初始化评论列表
                    function pageInitComment(){
                        AjaxPageList('#commentList', '#pagination', 10, 0, '/tools/submit_ajax.ashx?action=comment_list&channel_id=${new.channelId}&article_id=${new.id}');
                    }
                </script>
<form id="commentForm" name="commentForm" class="form-box" url="/tools/submit_ajax.ashx?action=comment_add&channel_id=${new.channelId}&article_id=${new.id}">
<div class="avatar-box">
<i class="iconfont icon-user-full"></i>
</div>
<div class="conn-box">
<div class="editor">
<textarea id="txtContent" name="txtContent" sucmsg="" datatype="*10-1000" nullmsg="请填写评论内容"></textarea>
</div>
<div class="subcon">
<input id="btnSubmit" name="submit" type="submit" value="提交评论" class="submit" />
<strong>验证码：</strong>
<input id="txtCode" name="txtCode" class="code" onkeydown="if(event.ctrlKey&amp;&amp;event.keyCode==13){document.getElementById('btnSubmit').click();return false};" type="text" sucmsg=" " datatype="s4-4" errormsg="请填写4位验证码" nullmsg="请填写验证码！" />
<a href="javascript:;" onclick="ToggleCode(this, '/tools/verify_code.ashx');return false;">
<img width="80" height="22" src="/tools/verify_code.ashx"> 看不清楚？
</a>
</div>
</div>
</form>
<ul id="commentList" class="list-box"></ul>

<div class="page-box" style="margin:5px 0 0 62px">
<div id="pagination" class="digg"></div>
</div>

</div>
</div>
<div class="left-455">
<div class="main-tit">
</div>
<div class="side-book">
<ul>

</ul>
</div>

</div>
</div>

</div>

<div class="footer">
<div class="section">
<div class="foot-nav">
<a href="/index.html">首页</a>
<a href="/news.html">资讯</a>
<a href="/tech.html">科技</a>
<a href="/yule.html">娱乐</a>
<a href="/game.html">游戏</a>
<a href="/sports.html">体育</a>
<a href="/finance.html">财经</a>
<a href="/military.html">军事</a>
<a href="/world.html">国际</a>
<a href="/fashion.html">时尚</a>
<a href="/travel.html">旅游</a>
<a href="/discovery.html">探索</a>
<a href="/baby.html">育儿</a>
<a href="/regimen.html">养生</a>
<<a href="/essay.html">美文</a>
<a href="/history.html">历史</a>
<a href="/food.html">美食</a>
</div>
<div class="foot-box">
<div class="copyright">
<p>版权所有 ${new.author} 冀ICP备19032112号-2</p>
<p>公司地址：广东省深圳市宝安区西乡街道 联系电话：QQ:13178050</p>
<p class="gray">Copyright © 2009-2021 ykdc.net Corporation,All Rights Reserved.</p>
</div>
<script type="text/javascript" src="https://s5.cnzz.com/z_stat.php?id=1276010202&web_id=1276010202"></script>
<div class="service">
<p>周一至周日 9:00-24:00</p>
<a href="http://www.ykdc.net" target="_blank"><i class="iconfont icon-phone"></i>在线客服</a>
</div>
</div>
</div>
</div>

</body>
</html>