<template>
    <div>
        用户名：<label>
        <input type="text" v-model="loginForm.username" placeholder="请输入用户名"/>
    </label>
        <br><br>
        密码：<label>
        <input type="password" v-model="loginForm.password" placeholder="请输入密码"/>
    </label>
        <br><br>
        <button v-on:click="login">登录</button>
    </div>
</template>

<script>
    import axios from 'axios'
    export default {
        name: "Login",
        data(){
            return {
                loginForm:{
                    username:'',
                    password:''
                },
                responseResult:[]
            }
        },

        methods: {
            login () {
                axios
                    .post('http://localhost:8443/api/login',
                        {
                            username: this.loginForm.username,
                            password: this.loginForm.password
                    })
                    .then(successResponse => {
                        // eslint-disable-next-line no-console
                        if (successResponse.data.code === 200) {
                            this.$router.replace({path: '/index'})
                        }
                    })
                    // eslint-disable-next-line no-unused-vars
                    .catch(failResponse => {
                    })
            }
        }
    }
</script>

<style scoped>

</style>
