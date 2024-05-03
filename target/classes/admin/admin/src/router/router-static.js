import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
    // 解决多次点击左侧菜单报错问题
    const VueRouterPush = VueRouter.prototype.push
    VueRouter.prototype.push = function push (to) {
    return VueRouterPush.call(this, to).catch(err => err)
    }
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dianfnag from '@/views/modules/dianfnag/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import jiaoshiqingjia from '@/views/modules/jiaoshiqingjia/list'
    import jiaoxueshipin from '@/views/modules/jiaoxueshipin/list'
    import kaihuitongzhi from '@/views/modules/kaihuitongzhi/list'
    import kecheng from '@/views/modules/kecheng/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yunyingshijian from '@/views/modules/yunyingshijian/list'
    import zuoye from '@/views/modules/zuoye/list'
    import config from '@/views/modules/config/list'
    import dictionaryBanji from '@/views/modules/dictionaryBanji/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryJiaoshiqingjia from '@/views/modules/dictionaryJiaoshiqingjia/list'
    import dictionaryJiaoshiqingjiaYesno from '@/views/modules/dictionaryJiaoshiqingjiaYesno/list'
    import dictionaryJiaoxueshipin from '@/views/modules/dictionaryJiaoxueshipin/list'
    import dictionaryKaihuitongzhi from '@/views/modules/dictionaryKaihuitongzhi/list'
    import dictionaryKecheng from '@/views/modules/dictionaryKecheng/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryYunyingshijian from '@/views/modules/dictionaryYunyingshijian/list'
    import dictionaryZuoye from '@/views/modules/dictionaryZuoye/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBanji',
        name: '班级',
        component: dictionaryBanji
    }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryJiaoshiqingjia',
        name: '请假类型',
        component: dictionaryJiaoshiqingjia
    }
    ,{
        path: '/dictionaryJiaoshiqingjiaYesno',
        name: '申请状态',
        component: dictionaryJiaoshiqingjiaYesno
    }
    ,{
        path: '/dictionaryJiaoxueshipin',
        name: '备课类型',
        component: dictionaryJiaoxueshipin
    }
    ,{
        path: '/dictionaryKaihuitongzhi',
        name: '会议类型',
        component: dictionaryKaihuitongzhi
    }
    ,{
        path: '/dictionaryKecheng',
        name: '课程类型',
        component: dictionaryKecheng
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryYunyingshijian',
        name: '运营事件类型',
        component: dictionaryYunyingshijian
    }
    ,{
        path: '/dictionaryZuoye',
        name: '作业类型',
        component: dictionaryZuoye
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dianfnag',
        name: '电访信息',
        component: dianfnag
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '交流平台',
        component: forum
      }
    ,{
        path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
    ,{
        path: '/jiaoshiqingjia',
        name: '教师请假',
        component: jiaoshiqingjia
      }
    ,{
        path: '/jiaoxueshipin',
        name: '备课信息',
        component: jiaoxueshipin
      }
    ,{
        path: '/kaihuitongzhi',
        name: '会议',
        component: kaihuitongzhi
      }
    ,{
        path: '/kecheng',
        name: '课程信息',
        component: kecheng
      }
    ,{
        path: '/news',
        name: '通知公告',
        component: news
      }
    ,{
        path: '/yonghu',
        name: '学生',
        component: yonghu
      }
    ,{
        path: '/yunyingshijian',
        name: '运营事件',
        component: yunyingshijian
      }
    ,{
        path: '/zuoye',
        name: '作业',
        component: zuoye
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
