var World = {
	loaded: false,

	init: function initFn() {
		/* Disable all sensors in "IR-only" Worlds to save performance. If the property is set to true, any geo-related components (such as GeoObjects and ActionRanges) are active. If the property is set to false, any geo-related components will not be visible on the screen, and triggers will not fire.*/
		AR.context.services.sensors = false;
		this.createOverlays();
	},

	createOverlays: function createOverlaysFn() {
		// Initialize Tracker
		this.tracker = new AR.Tracker("assets/Edificios_UVG.wtc", {
			onLoaded: this.worldLoaded
		});

		// Button image
		this.imgButton = new AR.ImageResource("assets/boton.jpg");
		this.imgButton2 = new AR.ImageResource("assets/biblioteca.jpg");

		// Edificio A
		var pageOneButton = this.createWwwButton("https://dl.dropboxusercontent.com/u/116987066/Wikitude/imagerecognition/extras/EdificioA.pdf", 0.15, {
			offsetX: 0,
			offsetY: -0.25,
			zOrder: 1
		});
		var pageOne = new AR.Trackable2DObject(this.tracker, "Edificio-A", {
			drawables: {
				cam: pageOneButton
			}
		});
		
		// Edificio B
		var pageTwoButton = this.createWwwButton("https://dl.dropboxusercontent.com/u/116987066/Wikitude/imagerecognition/extras/EdificioB.pdf", 0.15, {
			offsetX: 0,
			offsetY: -0.25,
			zOrder: 1
		});
		//Boton 2
		var ppageTwoButton2 = this.createWwwButton2("http://biblioteca.uvg.edu.gt/InfoCentre/Welcome.do", 0.15, {
			offsetX: 0.25,
			offsetY: +0.25,
			zOrder: 1
		});

		var pageTwo2 = new AR.Trackable2DObject(this.tracker, "Edificio-B", {
			drawables: {
				cam: [pageTwoButton, ppageTwoButton2]
			}
		});
		
		// Edificio C
		var pageThreeButton = this.createWwwButton("https://dl.dropboxusercontent.com/u/116987066/Wikitude/imagerecognition/extras/EdificioC.pdf", 0.15, {
			offsetX: 0,
			offsetY: -0.25,
			zOrder: 1
		});
		var pageThree = new AR.Trackable2DObject(this.tracker, "Edificio-C", {
			drawables: {
				cam: pageThreeButton
			}
		});
		
		// Edificio E
		var pageFourButton = this.createWwwButton("https://dl.dropboxusercontent.com/u/116987066/Wikitude/imagerecognition/extras/EdificioE.pdf", 0.15, {
			offsetX: 0,
			offsetY: -0.25,
			zOrder: 1
		});
		var pageFour = new AR.Trackable2DObject(this.tracker, "Edificio-E", {
			drawables: {
				cam: pageFourButton
			}
		});
		
		// Edificio F
		var pageFiveButton = this.createWwwButton("https://dl.dropboxusercontent.com/u/116987066/Wikitude/imagerecognition/extras/EdificioF.pdf", 0.15, {
			offsetX: 0,
			offsetY: -0.25,
			zOrder: 1
		});
		var pageFive = new AR.Trackable2DObject(this.tracker, "Edificio-F", {
			drawables: {
				cam: pageFiveButton
			}
		});
		
		// Edificio G
		var pageSixButton = this.createWwwButton("https://dl.dropboxusercontent.com/u/116987066/Wikitude/imagerecognition/extras/EdificioG.pdf", 0.15, {
			offsetX: 0,
			offsetY: -0.25,
			zOrder: 1
		});
		var pageSix = new AR.Trackable2DObject(this.tracker, "Edificio-G", {
			drawables: {
				cam: pageSixButton
			}
		});
		
		// Edificio H
		var pageSevenButton = this.createWwwButton("https://dl.dropboxusercontent.com/u/116987066/Wikitude/imagerecognition/extras/EdificioH.pdf", 0.15, {
			offsetX: 0,
			offsetY: -0.25,
			zOrder: 1
		});
		var pageSeven = new AR.Trackable2DObject(this.tracker, "Edificio-H", {
			drawables: {
				cam: pageSevenButton
			}
		});
		
		// Edificio I
		var pageEightButton = this.createWwwButton("https://dl.dropboxusercontent.com/u/116987066/Wikitude/imagerecognition/extras/EdificioI.pdf", 0.15, {
			offsetX: 0,
			offsetY: -0.25,
			zOrder: 1
		});
		var pageEight = new AR.Trackable2DObject(this.tracker, "Edificio-I", {
			drawables: {
				cam: pageEightButton
			}
		});
		
		// Edificio J
		var pageNineButton = this.createWwwButton("https://dl.dropboxusercontent.com/u/116987066/Wikitude/imagerecognition/extras/EdificioJ.pdf", 0.15, {
			offsetX: 0,
			offsetY: -0.25,
			zOrder: 1
		});
		var pageNine = new AR.Trackable2DObject(this.tracker, "Edificio-J", {
			drawables: {
				cam: pageNineButton
			}
		});

	},

	createWwwButton: function createWwwButtonFn(url, size, options) {
		options.onClick = function() {
			AR.context.openInBrowser(url);
		};
		return new AR.ImageDrawable(this.imgButton, size, options);
	},
	
	createWwwButton2: function createWwwButtonFn(url, size, options) {
		options.onClick = function() {
			AR.context.openInBrowser(url);
		};
		return new AR.ImageDrawable(this.imgButton2, size, options);
	},


	worldLoaded: function worldLoadedFn() {
		document.body.removeChild(document.getElementById('loadingMessage'));
	}
};

World.init();