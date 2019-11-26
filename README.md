# LatteEC
项目架构设计和模块分解 注解model                     代码生成器model  核心model 路由架构 HTTP请求 照片和二维码及图片剪裁封装 具有共性的通用UI 通用的工具 WebView处理 微信登录和支付封装 支付宝支付封装 诸多重复性模块   业务model1 相应一类业务的特殊UI 相应一类业务需要的通用逻辑 相应一类业务的特殊处理 业务model2  具体项目model 项目特有的个别功能 只有该项目需要的第三方库 只有该项目会更改的UI及逻辑 需要再application model中使用的一些签名和验证  annotationProcessor或apt生成代码
