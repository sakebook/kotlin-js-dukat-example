@file:JsQualifier("v")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package v

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface WordWrapOptions {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var newLine: String?
        get() = definedExternally
        set(value) = definedExternally
    var indent: String?
        get() = definedExternally
        set(value) = definedExternally
    var cut: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$0` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}

external interface VocaStatic {
    fun camelCase(subject: String = definedExternally): String
    fun capitalize(subject: String = definedExternally, restToLower: Boolean = definedExternally): String
    fun decapitalize(subject: String = definedExternally): String
    fun kebabCase(subject: String = definedExternally): String
    fun lowerCase(subject: String = definedExternally): String
    fun snakeCase(subject: String = definedExternally): String
    fun swapCase(subject: String = definedExternally): String
    fun titleCase(subject: String = definedExternally, ignoreWords: Array<String> = definedExternally): String
    fun upperCase(subject: String = definedExternally): String
    @nativeInvoke
    operator fun invoke(subject: Any): Chain
    fun <T> chain(subject: T): ExplicitChain<T>
    fun charAt(subject: String = definedExternally, position: Number = definedExternally): String
    fun codePointAt(subject: String = definedExternally, position: Number = definedExternally): String
    fun first(subject: String = definedExternally, length: Number = definedExternally): String
    fun graphemeAt(subject: String = definedExternally, position: Number = definedExternally): String
    fun last(subject: String = definedExternally, length: Number = definedExternally): String
    fun prune(subject: String = definedExternally, length: Number = definedExternally, end: String = definedExternally): String
    fun slice(subject: String = definedExternally, start: Number = definedExternally, end: Number = definedExternally): String
    fun substr(subject: String = definedExternally, start: Number = definedExternally, length: Number = definedExternally): String
    fun substring(subject: String = definedExternally, start: Number = definedExternally, end: Number = definedExternally): String
    fun truncate(subject: String = definedExternally, length: Number = definedExternally, end: String = definedExternally): String
    fun count(subject: String = definedExternally): Number
    fun countGraphemes(subject: String = definedExternally): Number
    fun countSubstrings(subject: String = definedExternally, substring: String = definedExternally): Number
    fun countWhere(subject: String = definedExternally, predicate: CountPredicate = definedExternally, context: Any = definedExternally): Number
    fun countWords(subject: String = definedExternally, pattern: String = definedExternally, flags: String = definedExternally): Number
    fun countWords(subject: String = definedExternally, pattern: RegExp = definedExternally, flags: String = definedExternally): Number
    fun escapeHtml(subject: String = definedExternally): String
    fun escapeRegExp(subject: String = definedExternally): String
    fun unescapeHtml(subject: String = definedExternally): String
    fun sprintf(format: String = definedExternally, vararg replacements: Any): String
    fun vprintf(format: String = definedExternally, vararg replacements: Any): String
    fun indexOf(subject: String = definedExternally, search: String = definedExternally, fromIndex: Number = definedExternally): Number
    fun lastIndexOf(subject: String = definedExternally, search: String = definedExternally, fromIndex: Number = definedExternally): Number
    fun search(subject: String = definedExternally, pattern: String = definedExternally, fromIndex: Number = definedExternally): Number
    fun search(subject: String = definedExternally, pattern: RegExp = definedExternally, fromIndex: Number = definedExternally): Number
    fun insert(subject: String = definedExternally, toInsert: String = definedExternally, position: Number = definedExternally): String
    fun latinise(subject: String = definedExternally): String
    fun pad(subject: String = definedExternally, length: Number = definedExternally, pad: String = definedExternally): String
    fun padLeft(subject: String = definedExternally, length: Number = definedExternally, pad: String = definedExternally): String
    fun padRight(subject: String = definedExternally, length: Number = definedExternally, pad: String = definedExternally): String
    fun repeat(subject: String = definedExternally, times: Number = definedExternally): String
    fun replace(subject: String = definedExternally, pattern: String = definedExternally, replacement: String = definedExternally): String
    fun replace(subject: String = definedExternally, pattern: String = definedExternally, replacement: ReplacementFunction = definedExternally): String
    fun replace(subject: String = definedExternally, pattern: RegExp = definedExternally, replacement: String = definedExternally): String
    fun replace(subject: String = definedExternally, pattern: RegExp = definedExternally, replacement: ReplacementFunction = definedExternally): String
    fun replaceAll(subject: String = definedExternally, pattern: String = definedExternally, replacement: String = definedExternally): String
    fun replaceAll(subject: String = definedExternally, pattern: String = definedExternally, replacement: ReplacementFunction = definedExternally): String
    fun replaceAll(subject: String = definedExternally, pattern: RegExp = definedExternally, replacement: String = definedExternally): String
    fun replaceAll(subject: String = definedExternally, pattern: RegExp = definedExternally, replacement: ReplacementFunction = definedExternally): String
    fun reverse(subject: String = definedExternally): String
    fun reverseGrapheme(subject: String = definedExternally): String
    fun slugify(subject: String = definedExternally): String
    fun splice(subject: String = definedExternally, start: Number = definedExternally, deleteCount: Number = definedExternally, toAdd: String = definedExternally): String
    fun tr(subject: String = definedExternally, from: String = definedExternally, to: String = definedExternally): String
    fun tr(subject: String = definedExternally, from: `T$0` = definedExternally): String
    fun trim(subject: String = definedExternally, whitespace: String = definedExternally): String
    fun trimLeft(subject: String = definedExternally, whitespace: String = definedExternally): String
    fun trimRight(subject: String = definedExternally, whitespace: String = definedExternally): String
    fun wordWrap(subject: String = definedExternally, options: WordWrapOptions = definedExternally): String
    fun endsWith(subject: String = definedExternally, end: String = definedExternally, position: Number = definedExternally): Boolean
    fun includes(subject: String = definedExternally, search: String = definedExternally, position: Number = definedExternally): Boolean
    fun isAlpha(subject: String = definedExternally): Boolean
    fun isAlphaDigit(subject: String = definedExternally): Boolean
    fun isBlank(subject: String = definedExternally): Boolean
    fun isDigit(subject: String = definedExternally): Boolean
    fun isEmpty(subject: String = definedExternally): Boolean
    fun isLowerCase(subject: String = definedExternally): Boolean
    fun isNumeric(subject: String = definedExternally): Boolean
    fun isString(subject: Any = definedExternally): Boolean
    fun isUpperCase(subject: String = definedExternally): Boolean
    fun matches(subject: String = definedExternally, pattern: String = definedExternally, flags: String = definedExternally): Boolean
    fun matches(subject: String = definedExternally, pattern: RegExp = definedExternally, flags: String = definedExternally): Boolean
    fun startsWith(subject: String = definedExternally, start: String = definedExternally, position: Number = definedExternally): Boolean
    fun chars(subject: String = definedExternally): Array<String>
    fun codePoints(subject: String = definedExternally): Array<Number>
    fun graphemes(subject: String = definedExternally): Array<String>
    fun split(subject: String = definedExternally, separator: String = definedExternally, limit: Number = definedExternally): Array<String>
    fun split(subject: String = definedExternally, separator: RegExp = definedExternally, limit: Number = definedExternally): Array<String>
    fun words(subject: String = definedExternally, pattern: String = definedExternally, flag: String = definedExternally): Array<String>
    fun words(subject: String = definedExternally, pattern: RegExp = definedExternally, flag: String = definedExternally): Array<String>
    fun stripBom(subject: String = definedExternally): String
    fun stripTags(subject: String = definedExternally, allowbleTags: String = definedExternally, replacement: String = definedExternally): String
    fun stripTags(subject: String = definedExternally, allowbleTags: Array<String> = definedExternally, replacement: String = definedExternally): String
    fun noConflict(): VocaStatic
    var version: String
    fun countWords(): Number
    fun search(): Number
    fun replace(): String
    fun replaceAll(): String
    fun matches(): Boolean
    fun split(): Array<String>
    fun words(): Array<String>
    fun stripTags(): String
}

external interface Chain {
    fun camelCase(): Chain
    fun capitalize(restToLoweropt: Boolean = definedExternally): Chain
    fun decapitalize(): Chain
    fun kebabCase(): Chain
    fun lowerCase(): Chain
    fun snakeCase(): Chain
    fun swapCase(): Chain
    fun titleCase(ignoreWordsopt: Array<String> = definedExternally): Chain
    fun upperCase(): Chain
    fun value(): String
    fun chain(): ExplicitChain<String>
    fun charAt(position: Number = definedExternally): Chain
    fun codePointAt(position: Number = definedExternally): Chain
    fun first(length: Number = definedExternally): Chain
    fun graphemeAt(position: Number = definedExternally): Chain
    fun last(length: Number = definedExternally): Chain
    fun prune(length: Number = definedExternally, end: String = definedExternally): Chain
    fun slice(start: Number = definedExternally, end: Number = definedExternally): Chain
    fun substr(start: Number = definedExternally, length: Number = definedExternally): Chain
    fun substring(start: Number = definedExternally, end: Number = definedExternally): Chain
    fun truncate(length: Number = definedExternally, end: String = definedExternally): Chain
    fun count(): Number
    fun countGraphemes(): Number
    fun countSubstrings(substring: String = definedExternally): Number
    fun countWhere(predicate: CountPredicate = definedExternally, context: Any = definedExternally): Number
    fun countWords(pattern: String = definedExternally, flags: String = definedExternally): Number
    fun countWords(pattern: RegExp = definedExternally, flags: String = definedExternally): Number
    fun escapeHtml(): Chain
    fun escapeRegExp(): Chain
    fun unescapeHtml(): Chain
    fun sprintf(vararg replacements: Any): Chain
    fun vprintf(vararg replacements: Any): Chain
    fun indexOf(search: String = definedExternally, fromIndex: Number = definedExternally): Number
    fun lastIndexOf(search: String = definedExternally, fromIndex: Number = definedExternally): Number
    fun search(pattern: String = definedExternally, fromIndex: Number = definedExternally): Number
    fun search(pattern: RegExp = definedExternally, fromIndex: Number = definedExternally): Number
    fun insert(toInsert: String = definedExternally, position: Number = definedExternally): Chain
    fun latinise(): Chain
    fun pad(length: Number = definedExternally, pad: String = definedExternally): Chain
    fun padLeft(length: Number = definedExternally, pad: String = definedExternally): Chain
    fun padRight(length: Number = definedExternally, pad: String = definedExternally): Chain
    fun repeat(times: Number = definedExternally): Chain
    fun replace(pattern: String = definedExternally, replacement: String = definedExternally): Chain
    fun replace(pattern: String = definedExternally, replacement: ReplacementFunction = definedExternally): Chain
    fun replace(pattern: RegExp = definedExternally, replacement: String = definedExternally): Chain
    fun replace(pattern: RegExp = definedExternally, replacement: ReplacementFunction = definedExternally): Chain
    fun replaceAll(pattern: String = definedExternally, replacement: String = definedExternally): Chain
    fun replaceAll(pattern: String = definedExternally, replacement: ReplacementFunction = definedExternally): Chain
    fun replaceAll(pattern: RegExp = definedExternally, replacement: String = definedExternally): Chain
    fun replaceAll(pattern: RegExp = definedExternally, replacement: ReplacementFunction = definedExternally): Chain
    fun reverse(): Chain
    fun reverseGrapheme(): Chain
    fun slugify(): Chain
    fun splice(start: Number = definedExternally, deleteCount: Number = definedExternally, toAdd: String = definedExternally): Chain
    fun tr(from: String = definedExternally, to: String = definedExternally): Chain
    fun tr(from: `T$0` = definedExternally): Chain
    fun trim(whitespace: String = definedExternally): Chain
    fun trimLeft(whitespace: String = definedExternally): Chain
    fun trimRight(whitespace: String = definedExternally): Chain
    fun wordWrap(options: WordWrapOptions = definedExternally): Chain
    fun endsWith(end: String = definedExternally, position: Number = definedExternally): Boolean
    fun includes(search: String = definedExternally, position: Number = definedExternally): Boolean
    fun isAlpha(): Boolean
    fun isAlphaDigit(): Boolean
    fun isBlank(): Boolean
    fun isDigit(): Boolean
    fun isEmpty(): Boolean
    fun isLowerCase(): Boolean
    fun isNumeric(): Boolean
    fun isString(): Boolean
    fun isUpperCase(): Boolean
    fun matches(pattern: String = definedExternally, flags: String = definedExternally): Boolean
    fun matches(pattern: RegExp = definedExternally, flags: String = definedExternally): Boolean
    fun startsWith(start: String = definedExternally, position: Number = definedExternally): Boolean
    fun chars(): Array<String>
    fun codePoints(): Array<Number>
    fun graphemes(): Array<String>
    fun split(separator: String = definedExternally, limit: Number = definedExternally): Array<String>
    fun split(separator: RegExp = definedExternally, limit: Number = definedExternally): Array<String>
    fun words(pattern: String = definedExternally, flag: String = definedExternally): Array<String>
    fun words(pattern: RegExp = definedExternally, flag: String = definedExternally): Array<String>
    fun stripBom(): Chain
    fun stripTags(allowbleTags: String = definedExternally, replacement: String = definedExternally): Chain
    fun stripTags(allowbleTags: Array<String> = definedExternally, replacement: String = definedExternally): Chain
    fun countWords(): Number
    fun search(): Number
    fun replace(): Chain
    fun replaceAll(): Chain
    fun matches(): Boolean
    fun split(): Array<String>
    fun words(): Array<String>
    fun stripTags(): Chain
}

external interface ExplicitChain<T> {
    fun camelCase(): ExplicitChain<String>
    fun capitalize(restToLoweropt: Boolean = definedExternally): ExplicitChain<String>
    fun decapitalize(): ExplicitChain<String>
    fun kebabCase(): ExplicitChain<String>
    fun lowerCase(): ExplicitChain<String>
    fun snakeCase(): ExplicitChain<String>
    fun swapCase(): ExplicitChain<String>
    fun titleCase(ignoreWordsopt: Array<String> = definedExternally): ExplicitChain<String>
    fun upperCase(): ExplicitChain<String>
    fun value(): T
    fun <U> thru(changer: (subjects: T) -> U): ExplicitChain<U>
    fun charAt(position: Number = definedExternally): ExplicitChain<String>
    fun codePointAt(position: Number = definedExternally): ExplicitChain<String>
    fun first(length: Number = definedExternally): ExplicitChain<String>
    fun graphemeAt(position: Number = definedExternally): ExplicitChain<String>
    fun last(length: Number = definedExternally): ExplicitChain<String>
    fun prune(length: Number = definedExternally, end: String = definedExternally): ExplicitChain<String>
    fun slice(start: Number = definedExternally, end: Number = definedExternally): ExplicitChain<String>
    fun substr(start: Number = definedExternally, length: Number = definedExternally): ExplicitChain<String>
    fun substring(start: Number = definedExternally, end: Number = definedExternally): ExplicitChain<String>
    fun truncate(length: Number = definedExternally, end: String = definedExternally): ExplicitChain<String>
    fun count(): ExplicitChain<Number>
    fun countGraphemes(): ExplicitChain<Number>
    fun countSubstrings(substring: String = definedExternally): ExplicitChain<Number>
    fun countWhere(predicate: CountPredicate = definedExternally, context: Any = definedExternally): ExplicitChain<Number>
    fun countWords(pattern: String = definedExternally, flags: String = definedExternally): ExplicitChain<Number>
    fun countWords(pattern: RegExp = definedExternally, flags: String = definedExternally): ExplicitChain<Number>
    fun escapeHtml(): ExplicitChain<String>
    fun escapeRegExp(): ExplicitChain<String>
    fun unescapeHtml(): ExplicitChain<String>
    fun sprintf(vararg replacements: Any): ExplicitChain<String>
    fun vprintf(vararg replacements: Any): ExplicitChain<String>
    fun indexOf(search: String = definedExternally, fromIndex: Number = definedExternally): ExplicitChain<Number>
    fun lastIndexOf(search: String = definedExternally, fromIndex: Number = definedExternally): ExplicitChain<Number>
    fun search(pattern: String = definedExternally, fromIndex: Number = definedExternally): ExplicitChain<Number>
    fun search(pattern: RegExp = definedExternally, fromIndex: Number = definedExternally): ExplicitChain<Number>
    fun insert(toInsert: String = definedExternally, position: Number = definedExternally): ExplicitChain<String>
    fun latinise(): ExplicitChain<String>
    fun pad(length: Number = definedExternally, pad: String = definedExternally): ExplicitChain<String>
    fun padLeft(length: Number = definedExternally, pad: String = definedExternally): ExplicitChain<String>
    fun padRight(length: Number = definedExternally, pad: String = definedExternally): ExplicitChain<String>
    fun repeat(times: Number = definedExternally): ExplicitChain<String>
    fun replace(pattern: String = definedExternally, replacement: String = definedExternally): ExplicitChain<String>
    fun replace(pattern: String = definedExternally, replacement: ReplacementFunction = definedExternally): ExplicitChain<String>
    fun replace(pattern: RegExp = definedExternally, replacement: String = definedExternally): ExplicitChain<String>
    fun replace(pattern: RegExp = definedExternally, replacement: ReplacementFunction = definedExternally): ExplicitChain<String>
    fun replaceAll(pattern: String = definedExternally, replacement: String = definedExternally): ExplicitChain<String>
    fun replaceAll(pattern: String = definedExternally, replacement: ReplacementFunction = definedExternally): ExplicitChain<String>
    fun replaceAll(pattern: RegExp = definedExternally, replacement: String = definedExternally): ExplicitChain<String>
    fun replaceAll(pattern: RegExp = definedExternally, replacement: ReplacementFunction = definedExternally): ExplicitChain<String>
    fun reverse(): ExplicitChain<String>
    fun reverseGrapheme(): ExplicitChain<String>
    fun slugify(): ExplicitChain<String>
    fun splice(start: Number = definedExternally, deleteCount: Number = definedExternally, toAdd: String = definedExternally): ExplicitChain<String>
    fun tr(from: String = definedExternally, to: String = definedExternally): ExplicitChain<String>
    fun tr(from: `T$0` = definedExternally): ExplicitChain<String>
    fun trim(whitespace: String = definedExternally): ExplicitChain<String>
    fun trimLeft(whitespace: String = definedExternally): ExplicitChain<String>
    fun trimRight(whitespace: String = definedExternally): ExplicitChain<String>
    fun wordWrap(options: WordWrapOptions = definedExternally): ExplicitChain<String>
    fun endsWith(end: String = definedExternally, position: Number = definedExternally): ExplicitChain<Boolean>
    fun includes(search: String = definedExternally, position: Number = definedExternally): ExplicitChain<Boolean>
    fun isAlpha(): ExplicitChain<Boolean>
    fun isAlphaDigit(): ExplicitChain<Boolean>
    fun isBlank(): ExplicitChain<Boolean>
    fun isDigit(): ExplicitChain<Boolean>
    fun isEmpty(): ExplicitChain<Boolean>
    fun isLowerCase(): ExplicitChain<Boolean>
    fun isNumeric(): ExplicitChain<Boolean>
    fun isString(): ExplicitChain<Boolean>
    fun isUpperCase(): ExplicitChain<Boolean>
    fun matches(pattern: String = definedExternally, flags: String = definedExternally): ExplicitChain<Boolean>
    fun matches(pattern: RegExp = definedExternally, flags: String = definedExternally): ExplicitChain<Boolean>
    fun startsWith(start: String = definedExternally, position: Number = definedExternally): ExplicitChain<Boolean>
    fun chars(): ExplicitChain<Array<String>>
    fun codePoints(): ExplicitChain<Array<Number>>
    fun graphemes(): ExplicitChain<Array<String>>
    fun split(separator: String = definedExternally, limit: Number = definedExternally): ExplicitChain<Array<String>>
    fun split(separator: RegExp = definedExternally, limit: Number = definedExternally): ExplicitChain<Array<String>>
    fun words(pattern: String = definedExternally, flag: String = definedExternally): ExplicitChain<Array<String>>
    fun words(pattern: RegExp = definedExternally, flag: String = definedExternally): ExplicitChain<Array<String>>
    fun stripBom(): ExplicitChain<String>
    fun stripTags(allowbleTags: String = definedExternally, replacement: String = definedExternally): ExplicitChain<String>
    fun stripTags(allowbleTags: Array<String> = definedExternally, replacement: String = definedExternally): ExplicitChain<String>
    fun countWords(): ExplicitChain<Number>
    fun search(): ExplicitChain<Number>
    fun replace(): ExplicitChain<String>
    fun replaceAll(): ExplicitChain<String>
    fun matches(): ExplicitChain<Boolean>
    fun split(): ExplicitChain<Array<String>>
    fun words(): ExplicitChain<Array<String>>
    fun stripTags(): ExplicitChain<String>
}