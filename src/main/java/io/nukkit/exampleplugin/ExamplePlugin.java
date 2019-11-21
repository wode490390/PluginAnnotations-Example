package io.nukkit.exampleplugin;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginLoadOrder;
import cn.wode490390.nukkit.pluginannotation.command.Command;
import cn.wode490390.nukkit.pluginannotation.command.Commands;
import cn.wode490390.nukkit.pluginannotation.dependency.Dependency;
import cn.wode490390.nukkit.pluginannotation.dependency.LoadBefore;
import cn.wode490390.nukkit.pluginannotation.dependency.SoftDependency;
import cn.wode490390.nukkit.pluginannotation.permission.ChildPermission;
import cn.wode490390.nukkit.pluginannotation.permission.Permission;
import cn.wode490390.nukkit.pluginannotation.plugin.ApiVersion;
import cn.wode490390.nukkit.pluginannotation.plugin.Description;
import cn.wode490390.nukkit.pluginannotation.plugin.LoadOrder;
import cn.wode490390.nukkit.pluginannotation.plugin.LogPrefix;
import cn.wode490390.nukkit.pluginannotation.plugin.Plugin;
import cn.wode490390.nukkit.pluginannotation.plugin.Website;
import cn.wode490390.nukkit.pluginannotation.plugin.author.Author;

@Plugin(name = "TestPlugin", version = "1.0")
@Description("A test plugin")
@LoadOrder(PluginLoadOrder.STARTUP)
@Author("md_5")
@Website("www.spigotmc.org")
@LogPrefix("Testing")
@Dependency("FastAsyncWorldEdit")
@Dependency("LuckPerms")
@LoadBefore("MobPlugin")
@SoftDependency("PlotSquared")
@Commands(@Command(name = "foo", desc = "Foo command", aliases = {"foobar", "fubar"}, permission = "test.foo", permissionMessage = "You do not have permission!", usage = "/<command> [test|stop]"))
@Permission(name = "test.foo", desc = "Allows foo command", defaultValue = "op")
@Permission(name = "test.*", desc = "Wildcard permission", defaultValue = "op", children = {@ChildPermission(name ="test.foo")})
@ApiVersion("1.0.0")
public class ExamplePlugin extends PluginBase {
}
