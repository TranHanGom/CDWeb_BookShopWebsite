<%@ page pageEncoding="utf-8"%>

<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="static/admin/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>Hiếu Boy</p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">ĐIỀU HƯỚNG</li>
        <li class="active treeview">
          <a href="admin">
            <i class="fa fa-dashboard"></i> <span>Trang Chủ</span>
          </a>
        </li>
        <li class="treeview">
          <a href="orderManagerr">
            <i class="fa fa-tags"></i>
            <span>Quản Lý Đơn Hàng</span>
            <span class="label label-primary pull-right">4</span>
          </a>
        </li>
        <li>
          <a href="categoryManager">
            <i class="fa fa-tags"></i> <span>Quản lý Danh Mục</span>
          </a>
        </li>
        <li class="treeview">
          <a href="productManager">
            <i class="fa fa-tags"></i>
            <span>Quản lý Sản Phẩm</span>
          </a>
        </li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>