var app = new Vue({
    el: '#app',
    data: {
        username: '',
        password: '',
        realName: '',
        email: '',
        status: 1,
        statuses: [
            { value: 0, label: '禁用' },
            { value: 1, label: '启用' }
        ],
        avatarUrl: '',
        fileList: [],
        selectPic: ''
    },
    methods: {
        handleOnChange(val){
            this.selectPic = val.raw;
        },
        handleUploadClick(){
            this.uploadImage();
        },
        uploadImage(){
            var formData = new FormData();
            formData.append("image", this.selectPic);

            axios.post('/image/upload', formData, {
                headers: {
                    'Content-Type': 'multipart/form-data'
                }
            })
                .then(function (response) {
                    console.log(response);
                    app.avatarUrl = response.data;
                    alert('上传成功');
                })
                .catch(function (error) {
                    console.log(error);
                    alert('上传失败');
                });
        },
        handleCreateClick(){
            console.log("create view");
            this.createAdministrator();
        },
        createAdministrator(){
            axios.post('/administrator/create', {
                username: this.username,
                password: this.password,
                realName: this.realName,
                email: this.email,
                avatarUrl: this.avatarUrl,
                status: this.status,
                
              })
              .then(function (response) {
                console.log(response);
                alert("创建成功");
              })
              .catch(function (error) {
                console.log(error);
              });
        }
    }
})