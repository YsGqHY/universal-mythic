package ink.ptms.um.impl4

import io.lumine.xikage.mythicmobs.io.MythicConfig
import io.lumine.xikage.mythicmobs.utils.config.file.FileConfiguration
import taboolib.library.configuration.ConfigurationSection
import taboolib.library.reflex.Reflex.Companion.getProperty
import taboolib.module.configuration.Type

/**
 * universal-mythic
 * ink.ptms.um.impl4.MobConfiguration
 *
 * @author 坏黑
 * @since 2022/9/2 14:46
 */
class Mob4Configuration(val config: MythicConfig) : ConfigurationSection {

    override val name: String
        get() = config.key

    override val parent: ConfigurationSection?
        get() = null

    override val type: Type
        get() = Type.YAML

    val root: FileConfiguration = kotlin.runCatching { config.fileConfiguration }.getOrElse { config.getProperty<FileConfiguration>("fc")!! }

    override fun clear() {
        error("Unmodifiable")
    }

    override fun contains(path: String): Boolean {
        return config.isSet(path)
    }

    override fun createSection(path: String): ConfigurationSection {
        error("Unmodifiable")
    }

    override fun get(path: String): Any? {
        return root.get("$name.$path")
    }

    override fun get(path: String, def: Any?): Any? {
        return root.get("$name.$path", def)
    }

    override fun getBoolean(path: String): Boolean {
        return root.getBoolean("$name.$path")
    }

    override fun getBoolean(path: String, def: Boolean): Boolean {
        return root.getBoolean("$name.$path", def)
    }

    override fun getBooleanList(path: String): List<Boolean> {
        return root.getBooleanList("$name.$path")
    }

    override fun getByteList(path: String): List<Byte> {
        return root.getByteList("$name.$path")
    }

    override fun getCharacterList(path: String): List<Char> {
        return root.getCharacterList("$name.$path")
    }

    override fun getComment(path: String): String? {
        return null
    }

    override fun getConfigurationSection(path: String): ConfigurationSection? {
        return root.getConfigurationSection("$name.$path")?.let { Mob4Configuration(MythicConfig("$name.$path", root)) }
    }

    override fun getDouble(path: String): Double {
        return root.getDouble("$name.$path")
    }

    override fun getDouble(path: String, def: Double): Double {
        return root.getDouble("$name.$path", def)
    }

    override fun getDoubleList(path: String): List<Double> {
        return root.getDoubleList("$name.$path")
    }

    override fun <T : Enum<T>> getEnum(path: String, type: Class<T>): T? {
        error("Unsupported")
    }

    override fun <T : Enum<T>> getEnumList(path: String, type: Class<T>): List<T> {
        error("Unsupported")
    }

    override fun getFloatList(path: String): List<Float> {
        return root.getFloatList("$name.$path")
    }

    override fun getInt(path: String): Int {
        return root.getInt("$name.$path")
    }

    override fun getInt(path: String, def: Int): Int {
        return root.getInt("$name.$path", def)
    }

    override fun getIntegerList(path: String): List<Int> {
        return root.getIntegerList("$name.$path")
    }

    override fun getKeys(deep: Boolean): Set<String> {
        return root.getConfigurationSection(name)?.getKeys(deep) ?: emptySet()
    }

    override fun getList(path: String): List<*>? {
        return root.getList("$name.$path")
    }

    override fun getList(path: String, def: List<*>?): List<*>? {
        return root.getList("$name.$path", def)
    }

    override fun getLong(path: String): Long {
        return root.getLong("$name.$path")
    }

    override fun getLong(path: String, def: Long): Long {
        return root.getLong("$name.$path", def)
    }

    override fun getLongList(path: String): List<Long> {
        return root.getLongList("$name.$path")
    }

    override fun getMapList(path: String): List<Map<*, *>> {
        return root.getMapList("$name.$path")
    }

    override fun getShortList(path: String): List<Short> {
        return root.getShortList("$name.$path")
    }

    override fun getString(path: String): String? {
        return root.getString("$name.$path")
    }

    override fun getString(path: String, def: String?): String? {
        return root.getString("$name.$path", def)
    }

    override fun getStringList(path: String): List<String> {
        return root.getStringList("$name.$path")
    }

    override fun getValues(deep: Boolean): Map<String, Any?> {
        return root.getConfigurationSection(name)?.getValues(deep) ?: emptyMap()
    }

    override fun isBoolean(path: String): Boolean {
        return root.isBoolean("$name.$path")
    }

    override fun isConfigurationSection(path: String): Boolean {
        return root.isConfigurationSection("$name.$path")
    }

    override fun isDouble(path: String): Boolean {
        return root.isDouble("$name.$path")
    }

    override fun isInt(path: String): Boolean {
        return root.isInt("$name.$path")
    }

    override fun isList(path: String): Boolean {
        return root.isList("$name.$path")
    }

    override fun isLong(path: String): Boolean {
        return root.isLong("$name.$path")
    }

    override fun isString(path: String): Boolean {
        return root.isString("$name.$path")
    }

    override fun set(path: String, value: Any?) {
        error("Unmodifiable")
    }

    override fun setComment(path: String, comment: String?) {
        error("Unmodifiable")
    }

    override fun toMap(): Map<String, Any?> {
        error("Unsupported")
    }
}