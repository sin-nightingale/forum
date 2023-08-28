<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/4/22
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>个人资料</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/player_info.css" />


</head>

<body>

<jsp:include page="../head/head_search.jsp" flush="true"/>
  <div id="wp" class="wp cl" style="min-width:90%;">
    <div id="pt" class="bm cl">
        <div class="z">
            <a href="${pageContext.request.contextPath}/index.jsp" class="nvhm"  title="首页">>>首页 Keylol</a> <em>&rsaquo;</em><a href="#">设置</a> <em>&rsaquo;</em>个人资料
        </div>
    </div>
    <div id="ct" class="ct2_a wp cl" style="min-width:100%;">
        <div class="mn">
            <div class="bm bw0">
                <h1 class="mt">个人资料</h1>
                <ul class="tb cl">
                    <li  class="a"><a href="#">基本资料</a></li>
                    <li ><a href="#">联系方式</a></li>
                    <li ><a href="#">教育情况</a></li>
                    <li ><a href="#">工作情况</a></li>
                    <li ><a href="#">个人信息</a></li>
                    <li><a href="#">修改用户名</a></li>
                    <li><a href="#">更改昵称</a></li>
                </ul>
                <iframe id="frame_profile" name="frame_profile" style="display: none"></iframe>
<%--                home.php?mod=spacecp&ac=profile&op=base--%>
                <form action="${pageContext.request.contextPath}/userInfoServlet" method="post">
                    <input type="hidden" value="58a1f004" name="formhash" />
                    <table  class="tfm" id="profilelist">
                        <tr>
                            <th>用户名</th>
                            <td>m2612806768</td>
                            <td>&nbsp;</td>
                        </tr><tr id="tr_gender">
                        <th id="th_gender">性别</th>
                        <td id="td_gender">
                            <select name="gender" id="gender" class="ps" tabindex="1"><option value="女" selected="selected">保密</option><option value="男">男</option><option value="2">女</option></select><div class="rq mtn" id="showerror_gender"></div><p class="d"></p></td>
                        <td class="p">
                            <select name="privacy[gender]">
                                <option value="0">公开</option>
                                <option value="1">好友可见</option>
                                <option value="3">保密</option>
                            </select>
                        </td>
                    </tr>
                        <tr id="tr_birthday">
                            <th id="th_birthday">生日</th>
                            <td id="td_birthday">
                                <select name="birthyear" id="birthyear" class="ps" onchange="showbirthday();" tabindex="1"><option value="">年</option><option value="2022">2022</option><option value="2021">2021</option><option value="2020">2020</option><option value="2019">2019</option><option value="2018">2018</option><option value="2017">2017</option><option value="2016">2016</option><option value="2015">2015</option><option value="2014">2014</option><option value="2013">2013</option><option value="2012">2012</option><option value="2011">2011</option><option value="2010">2010</option><option value="2009">2009</option><option value="2008">2008</option><option value="2007">2007</option><option value="2006">2006</option><option value="2005">2005</option><option value="2004">2004</option><option value="2003">2003</option><option value="2002">2002</option><option value="2001">2001</option><option value="2000">2000</option><option value="1999">1999</option><option value="1998">1998</option><option value="1997">1997</option><option value="1996">1996</option><option value="1995">1995</option><option value="1994">1994</option><option value="1993">1993</option><option value="1992">1992</option><option value="1991">1991</option><option value="1990">1990</option><option value="1989">1989</option><option value="1988">1988</option><option value="1987">1987</option><option value="1986">1986</option><option value="1985">1985</option><option value="1984">1984</option><option value="1983">1983</option><option value="1982">1982</option><option value="1981">1981</option><option value="1980">1980</option><option value="1979">1979</option><option value="1978">1978</option><option value="1977">1977</option><option value="1976">1976</option><option value="1975">1975</option><option value="1974">1974</option><option value="1973">1973</option><option value="1972">1972</option><option value="1971">1971</option><option value="1970">1970</option><option value="1969">1969</option><option value="1968">1968</option><option value="1967">1967</option><option value="1966">1966</option><option value="1965">1965</option><option value="1964">1964</option><option value="1963">1963</option><option value="1962">1962</option><option value="1961">1961</option><option value="1960">1960</option><option value="1959">1959</option><option value="1958">1958</option><option value="1957">1957</option><option value="1956">1956</option><option value="1955">1955</option><option value="1954">1954</option><option value="1953">1953</option><option value="1952">1952</option><option value="1951">1951</option><option value="1950">1950</option><option value="1949">1949</option><option value="1948">1948</option><option value="1947">1947</option><option value="1946">1946</option><option value="1945">1945</option><option value="1944">1944</option><option value="1943">1943</option><option value="1942">1942</option><option value="1941">1941</option><option value="1940">1940</option><option value="1939">1939</option><option value="1938">1938</option><option value="1937">1937</option><option value="1936">1936</option><option value="1935">1935</option><option value="1934">1934</option><option value="1933">1933</option><option value="1932">1932</option><option value="1931">1931</option><option value="1930">1930</option><option value="1929">1929</option><option value="1928">1928</option><option value="1927">1927</option><option value="1926">1926</option><option value="1925">1925</option><option value="1924">1924</option><option value="1923">1923</option></select>&nbsp;&nbsp;<select name="birthmonth" id="birthmonth" class="ps" onchange="showbirthday();" tabindex="1"><option value="">月</option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option></select>&nbsp;&nbsp;<select name="birthday" id="birthday" class="ps" tabindex="1"><option value="">日</option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select><div class="rq mtn" id="showerror_birthday"></div><p class="d"></p></td>
                            <td class="p">
                                <select name="privacy[birthday]">
                                    <option value="0">公开</option>
                                    <option value="1">好友可见</option>
                                    <option value="3">保密</option>
                                </select>
                            </td>
                        </tr>
                        <tr id="tr_realname">
                            <th id="th_realname">真实姓名</th>
                            <td id="td_realname">
                                <input type="text" name="realname" id="realname" class="px" value="" tabindex="1" /><div class="rq mtn" id="showerror_realname"></div><p class="d"></p></td>
                            <td class="p">
                                <select name="privacy[realname]">
                                    <option value="0">公开</option>
                                    <option value="1">好友可见</option>
                                    <option value="3">保密</option>
                                </select>
                            </td>
                        </tr>
                        <tr id="tr_birthcity">
                            <th id="th_birthcity">出生地</th>
                            <td id="td_birthcity">
                                <p id="birthdistrictbox"><select name="birthprovince" id="birthprovince" class="ps" onchange="showdistrict('birthdistrictbox', ['birthprovince', 'birthcity', 'birthdist', 'birthcommunity'], 1, 1, 'birth')" tabindex="1"><option value="">-省份-</option><option did="45294" value="未填写">未填写</option><option did="1" value="北京市">北京市</option><option did="9" value="上海市">上海市</option><option did="19" value="广东省">广东省</option><option did="22" value="重庆市">重庆市</option><option did="2" value="天津市">天津市</option><option did="10" value="江苏省">江苏省</option><option did="11" value="浙江省">浙江省</option><option did="23" value="四川省">四川省</option><option did="13" value="福建省">福建省</option><option did="3" value="河北省">河北省</option><option did="4" value="山西省">山西省</option><option did="5" value="内蒙古自治区">内蒙古自治区</option><option did="6" value="辽宁省">辽宁省</option><option did="7" value="吉林省">吉林省</option><option did="8" value="黑龙江省">黑龙江省</option><option did="12" value="安徽省">安徽省</option><option did="14" value="江西省">江西省</option><option did="15" value="山东省">山东省</option><option did="16" value="河南省">河南省</option><option did="17" value="湖北省">湖北省</option><option did="18" value="湖南省">湖南省</option><option did="20" value="广西壮族自治区">广西壮族自治区</option><option did="21" value="海南省">海南省</option><option did="24" value="贵州省">贵州省</option><option did="25" value="云南省">云南省</option><option did="26" value="西藏自治区">西藏自治区</option><option did="27" value="陕西省">陕西省</option><option did="28" value="甘肃省">甘肃省</option><option did="29" value="青海省">青海省</option><option did="30" value="宁夏回族自治区">宁夏回族自治区</option><option did="31" value="新疆维吾尔自治区">新疆维吾尔自治区</option><option did="32" value="台湾地区">台湾地区</option><option did="33" value="香港特别行政区">香港特别行政区</option><option did="34" value="澳门特别行政区">澳门特别行政区</option><option did="35" value="海外">海外</option><option did="36" value="其他">其他</option></select>&nbsp;&nbsp;</p><div class="rq mtn" id="showerror_birthcity"></div><p class="d"></p></td>
                            <td class="p">
                                <select name="privacy[birthcity]">
                                    <option value="0">公开</option>
                                    <option value="1">好友可见</option>
                                    <option value="3">保密</option>
                                </select>
                            </td>
                        </tr>
                        <tr id="tr_bloodtype">
                            <th id="th_bloodtype">血型</th>
                            <td id="td_bloodtype">
                                <select name="bloodtype" id="bloodtype" class="ps" tabindex="1"><option value="A">A</option><option value="B">B</option><option value="AB">AB</option><option value="O">O</option><option value="其它">其它</option></select><div class="rq mtn" id="showerror_bloodtype"></div><p class="d"></p></td>
                            <td class="p">
                                <select name="privacy[bloodtype]">
                                    <option value="0">公开</option>
                                    <option value="1">好友可见</option>
                                    <option value="3">保密</option>
                                </select>
                            </td>
                        </tr>
                        <tr id="tr_lookingfor">
                            <th id="th_lookingfor">邮箱</th>
                            <td id="td_lookingfor">
                                <input type="text" name="lookingfor" id="lookingfor" class="px" value="" tabindex="1" /><div class="rq mtn" id="showerror_lookingfor"></div><p class="d"></p></td>
                            <td class="p">
                                <select name="privacy[lookingfor]">
                                    <option value="0">公开</option>
                                    <option value="1">好友可见</option>
                                    <option value="3">保密</option>
                                </select>
                            </td>
                        </tr>
                        <tr id="tr_residecity">
                            <th id="th_residecity">居住地</th>
                            <td id="td_residecity">
                                <p id="residedistrictbox"><select
                                        name="resideprovince"
                                        id="resideprovince" class="ps"
                                        onchange="showdistrict('residedistrictbox', ['resideprovince', 'residecity', 'residedist', 'residecommunity'], 1, 1, 'reside')"
                                        tabindex="1">
                                    <option value="">-省份-</option>
                                    <option did="45294" value="未填写">未填写</option><option did="1" value="北京市">北京市</option><option did="9" value="上海市">上海市</option><option did="19" value="广东省">广东省</option><option did="22" value="重庆市">重庆市</option><option did="2" value="天津市">天津市</option><option did="10" value="江苏省">江苏省</option><option did="11" value="浙江省">浙江省</option><option did="23" value="四川省">四川省</option><option did="13" value="福建省">福建省</option><option did="3" value="河北省">河北省</option><option did="4" value="山西省">山西省</option><option did="5" value="内蒙古自治区">内蒙古自治区</option><option did="6" value="辽宁省">辽宁省</option><option did="7" value="吉林省">吉林省</option><option did="8" value="黑龙江省">黑龙江省</option><option did="12" value="安徽省">安徽省</option><option did="14" value="江西省">江西省</option><option did="15" value="山东省">山东省</option><option did="16" value="河南省">河南省</option><option did="17" value="湖北省">湖北省</option><option did="18" value="湖南省">湖南省</option><option did="20" value="广西壮族自治区">广西壮族自治区</option><option did="21" value="海南省">海南省</option><option did="24" value="贵州省">贵州省</option><option did="25" value="云南省">云南省</option><option did="26" value="西藏自治区">西藏自治区</option><option did="27" value="陕西省">陕西省</option><option did="28" value="甘肃省">甘肃省</option><option did="29" value="青海省">青海省</option><option did="30" value="宁夏回族自治区">宁夏回族自治区</option><option did="31" value="新疆维吾尔自治区">新疆维吾尔自治区</option><option did="32" value="台湾地区">台湾地区</option><option did="33" value="香港特别行政区">香港特别行政区</option><option did="34" value="澳门特别行政区">澳门特别行政区</option><option did="35" value="海外">海外</option><option did="36" value="其他">其他</option></select>&nbsp;&nbsp;</p><div class="rq mtn" id="showerror_residecity"></div><p class="d"></p></td>
                            <td class="p">
                                <select name="privacy[residecity]">
                                    <option value="0">公开</option>
                                    <option value="1">好友可见</option>
                                    <option value="3">保密</option>
                                </select>
                            </td>
                        </tr>
                        <tr id="tr_affectivestatus">
                            <th id="th_affectivestatus">个人说明</th>
                            <td id="td_affectivestatus">
                                <textarea name="affectivestatus" wrap="hard" rows="10" cols="50" placeholder="填写个人介绍更容易让大家了解你，点击此处添加"></textarea>
                            </td>
                            <td class="p">
                                <select name="privacy[affectivestatus]">
                                    <option value="0">公开</option>
                                    <option value="1">好友可见</option>
                                    <option value="3">保密</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <th>&nbsp;</th>
                            <td colspan="2">
                                <input type="hidden" name="profilesubmit" value="true" />
                                <button type="submit" name="profilesubmitbtn" id="profilesubmitbtn" value="保存" class="pn pnc" /><strong>保存</strong></button>
                                <span id="submit_result" class="rq"></span>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="appl">
            <div class="tbn">
                <h2 class="mt bbda">设置</h2>
                <ul>
                    <li><a href="#">修改头像</a></li>
                    <li><a href="#">修改密码</a></li>
                    <li class="a"><a href="#">个人资料</a></li>
                </ul>
            </div>
        </div>
    </div>
  </div>
</body>
</html>
