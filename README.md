# sbt-emberjs

A plugin for sbt-0.11.x that aggregates javascript code, wrappes each
file in a spade handler and processes handlebars templates files.


## Usage

Depend on the plugin: `./project/plugins.sbt`

    resolvers += "stefri" at "http://stefri.github.com/repo/snapshots"

    addSbtPlugin("com.github.stefri" % "sbt-emberjs" % "0.1-SNAPSHOT")

Ember picks it's libraries form `src/main/emberjs/libs`, the source
files either from `src/main/emberjs/js` or `resource_managed/main/js`.
The latter is used to play nicely with the coffeescript plugin. You
don't have to use both. All files ending in `.handlebars` which are
placed in `src/main/emberjs/templates` are handled as handlebars
template files. They are processed as they are and not precompiled at
the moment.

The plugin arregates all files in a
`resouce_managed/main/assets/application.js` file. It is planned to do
minification when requested, but this feature is not implemented yet.
The generated file inludes `spade` (version 1.0.2) but be carful, the
nameing of the artifacts is slightly different to bpm. Have a look at
the generated javascript file.

Documentation will be updated as soon as this plugin is a bit more
stable and tested. It will include notes how to migrate from bpm and how
to use it together with the coffeescript plugin.


## Include Plugin Settings

Include the settings from `emberjs.EmberjsPlugin.emberjsSettings` in
your project build file. See the [SBT wiki page on plugins][1] for
further details.


## Problems and Feature Requests

Please use the issue tracker on github if you find a bug or want to
request a specific feature. Note, this plugin is in early alpha, there
are still lots of things todo - feel free to fork and send a pull
request to improve the codebase.


## License

`sbt-emberjs` is licensed under the [Apache 2.0 License][2],
see the `LICENSE.md` file for further details.

  [1]: https://github.com/harrah/xsbt/wiki/Plugins
  [2]: http://www.apache.org/licenses/LICENSE-2.0.html
