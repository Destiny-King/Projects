<template>
  <div>
    <el-menu
        style="width: 200px;min-height: calc(100vh - 50px)"
        default-active="2"
        class="el-menu-vertical-demo"
        @open="handleOpen"
        @close="handleClose">
      <el-sub-menu index="1">
        <template #title>
          <el-icon>
            <Location/>
          </el-icon>
          <span>导航一</span>
        </template>
      </el-sub-menu>
      <el-menu-item index="2">
        <el-icon>
          <Menu/>
        </el-icon>
        <span>导航二</span>
      </el-menu-item>
      <el-menu-item index="3">
        <el-icon>
          <Document/>
        </el-icon>
        <span>导航三</span>
      </el-menu-item>
      <el-menu-item index="4">
        <el-icon>
          <Setting/>
        </el-icon>
        <span>导航四</span>
      </el-menu-item>
    </el-menu>
  </div>
</template>

<script>
import { Document, Menu, Location, Setting } from '@element-plus/icons-vue'
export default {
  name: "Aside",
  components: { Document, Menu, Location, Setting }
}
</script>

<style scoped>

</style>