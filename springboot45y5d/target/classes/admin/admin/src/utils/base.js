const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot45y5d/",
            name: "springboot45y5d",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot45y5d/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "进修者CS/AI学习者博客社区系统"
        } 
    }
}
export default base
