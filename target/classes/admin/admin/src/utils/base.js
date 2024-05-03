const base = {
    get() {
        return {
            url : "http://localhost:8080/xianshangjiaoyupeuxunbangong/",
            name: "xianshangjiaoyupeuxunbangong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xianshangjiaoyupeuxunbangong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "线上教育培训办公系统"
        } 
    }
}
export default base
