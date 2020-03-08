<template>
<div>
  <br>
  <el-form :inline="true">
          <el-form-item label="活动名称">
<el-input v-model="searchMap.name" placeholder="活动名称"></el-input></el-form-item>
          <el-form-item label="大会简介">
<el-input v-model="searchMap.summary" placeholder="大会简介"></el-input></el-form-item>
          <el-form-item label="详细说明">
<el-input v-model="searchMap.detail" placeholder="详细说明"></el-input></el-form-item>
          <el-form-item label="主办方">
<el-input v-model="searchMap.sponsor" placeholder="主办方"></el-input></el-form-item>
          <el-form-item label="活动图片">
<el-input v-model="searchMap.image" placeholder="活动图片"></el-input></el-form-item>
          <el-form-item label="开始时间">
<el-input v-model="searchMap.starttime" placeholder="开始时间"></el-input></el-form-item>
          <el-form-item label="截止时间">
<el-input v-model="searchMap.endtime" placeholder="截止时间"></el-input></el-form-item>
          <el-form-item label="举办地点">
<el-input v-model="searchMap.address" placeholder="举办地点"></el-input></el-form-item>
          <el-form-item label="报名截止">
<el-input v-model="searchMap.enrolltime" placeholder="报名截止"></el-input></el-form-item>
          <el-form-item label="是否可见">
<el-input v-model="searchMap.state" placeholder="是否可见"></el-input></el-form-item>
          <el-form-item label="城市">
<el-input v-model="searchMap.city" placeholder="城市"></el-input></el-form-item>

    <el-button type="primary" @click="fetchData()">查询</el-button>
    <el-button type="primary" @click="handleEdit('')">新增</el-button>
  </el-form>
  <el-table
    :data="list"
    border
    style="width: 100%">
          <el-table-column prop="id" label="编号" width="80"></el-table-column>
          <el-table-column prop="name" label="活动名称" width="80"></el-table-column>
          <el-table-column prop="summary" label="大会简介" width="80"></el-table-column>
          <el-table-column prop="detail" label="详细说明" width="80"></el-table-column>
          <el-table-column prop="sponsor" label="主办方" width="80"></el-table-column>
          <el-table-column prop="image" label="活动图片" width="80"></el-table-column>
          <el-table-column prop="starttime" label="开始时间" width="80"></el-table-column>
          <el-table-column prop="endtime" label="截止时间" width="80"></el-table-column>
          <el-table-column prop="address" label="举办地点" width="80"></el-table-column>
          <el-table-column prop="enrolltime" label="报名截止" width="80"></el-table-column>
          <el-table-column prop="state" label="是否可见" width="80"></el-table-column>
          <el-table-column prop="city" label="城市" width="80"></el-table-column>

    <el-table-column
      fixed="right"
      label="操作"
      width="100">
      <template slot-scope="scope">
        <el-button @click="handleEdit(scope.row.id)" type="text" size="small">修改</el-button>
        <el-button @click="handleDelete(scope.row.id)" type="text" size="small">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
      <el-pagination
      @size-change="fetchData"
      @current-change="fetchData"
      :current-page="currentPage"
      :page-sizes="[5,10,20]"
      :page-size="10"
      layout="total, sizes, prev, pager, next, jumper"
      :total="total">
    </el-pagination>  
  <el-dialog title="编辑" :visible.sync="dialogFormVisible">
    <el-form label-width="80px">
        <el-form-item label="活动名称"><el-input v-model="pojo.name"></el-input></el-form-item>
        <el-form-item label="大会简介"><el-input v-model="pojo.summary"></el-input></el-form-item>
        <el-form-item label="详细说明"><el-input v-model="pojo.detail"></el-input></el-form-item>
        <el-form-item label="主办方"><el-input v-model="pojo.sponsor"></el-input></el-form-item>
        <el-form-item label="活动图片"><el-input v-model="pojo.image"></el-input></el-form-item>
        <el-form-item label="开始时间"><el-input v-model="pojo.starttime"></el-input></el-form-item>
        <el-form-item label="截止时间"><el-input v-model="pojo.endtime"></el-input></el-form-item>
        <el-form-item label="举办地点"><el-input v-model="pojo.address"></el-input></el-form-item>
        <el-form-item label="报名截止"><el-input v-model="pojo.enrolltime"></el-input></el-form-item>
        <el-form-item label="是否可见"><el-input v-model="pojo.state"></el-input></el-form-item>
        <el-form-item label="城市"><el-input v-model="pojo.city"></el-input></el-form-item>

        <el-button type="primary" @click="handleSave()">保存</el-button>
        <el-button @click="dialogFormVisible = false" >关闭</el-button>
    </el-form>
  </el-dialog>
</div>
</template>
<script>
import gatheringApi from '@/api/gathering'
export default {
  data() {
    return {
      list: [],
      total: 0, // 总记录数
      currentPage: 1, // 当前页
      pageSize: 10, // 每页大小
      searchMap: {}, // 查询条件
      dialogFormVisible: false, // 编辑窗口是否可见
      pojo: {}, // 编辑表单绑定的实体对象
      cityList: [], // 城市列表
      id: '' // 当前用户修改的ID
    }
  },
  created() {
    this.fetchData()
  },
  methods: {
    fetchData() {
      gatheringApi.search(this.currentPage, this.pageSize, this.searchMap).then(response => {
        this.list = response.data.rows
        this.total = response.data.total
      })
    },
    handleSave() {
      gatheringApi.update(this.id, this.pojo).then(response => {
        this.$message({
          message: response.message,
          type: (response.flag ? 'success' : 'error')
        })
        if (response.flag) { // 如果成功
          this.fetchData() // 刷新列表
        }
      })
      this.dialogFormVisible = false // 关闭窗口
    },
    handleEdit(id) {
      this.id = id
      this.dialogFormVisible = true // 打开窗口
      if (id !== '') { // 修改
        gatheringApi.findById(id).then(response => {
          if (response.flag) {
            this.pojo = response.data
          }
        })
      } else {
        this.pojo = {} // 清空数据
      }
    },
    handleDelete(id) {
      this.$confirm('确定要删除此纪录吗?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        gatheringApi.deleteById(id).then(response => {
          this.$message({ message: response.message, type: (response.flag ? 'success' : 'error') })
          if (response.flag) {
            this.fetchData() // 刷新数据
          }
        })
      })
    }
  }
}
</script>
